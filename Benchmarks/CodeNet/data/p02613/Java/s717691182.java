import java.io.*;
import java.util.*;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static FastReader s = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    private static int[] rai(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    private static int[][] rai(int n, int m) {
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }

    private static long[] ral(int n) {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextLong();
        }
        return arr;
    }

    private static long[][] ral(int n, int m) {
        long[][] arr = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextLong();
            }
        }
        return arr;
    }

    private static int ri() {
        return s.nextInt();
    }

    private static long rl() {
        return s.nextLong();
    }

    private static String rs() {
        return s.next();
    }
    static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }


    static final int MAXN = 10000001;

    // stores smallest prime factor for every number
    static int spf[] = new int[MAXN];

    // Calculating SPF (Smallest Prime Factor) for every
    // number till MAXN.
    // Time Complexity : O(nloglogn)
    static void sieve()
    {
        spf[1] = 1;
        for (int i=2; i<MAXN; i++)

            // marking smallest prime factor for every
            // number to be itself.
            spf[i] = i;

        // separately marking spf for every even
        // number as 2
        for (int i=4; i<MAXN; i+=2)
            spf[i] = 2;

        for (int i=3; i*i<MAXN; i++)
        {
            // checking if i is prime
            if (spf[i] == i)
            {
                // marking SPF for all numbers divisible by i
                for (int j=i*i; j<MAXN; j+=i)

                    // marking spf[j] if it is not
                    // previously marked
                    if (spf[j]==j)
                        spf[j] = i;
            }
        }
    }

    // A O(log n) function returning primefactorization
    // by dividing by smallest prime factor at every step
    static long getFactorization(int x)
    {
        Vector<Integer> ret = new Vector<>();
        while (x != 1)
        {
            ret.add(spf[x]);
            x = x / spf[x];
        }
        HashMap<Integer,Long> map=new HashMap<>();
        for(int i:ret)
        {
            map.put(i,map.getOrDefault(i,0L)+1L);
        }
        long prod=1L;
        for(int i:map.keySet())
        {
            prod*=map.get(i)+1L;
        }

        return prod;
    }
    public int kthFactor(int n, int k) {
        TreeSet<Integer> pq=new TreeSet<>();
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                pq.add(i);
                pq.add(n/i);
            }
        }
        if(pq.size()<k)
        {
            return -1;
        }
        else {
            List<Integer> list = new ArrayList<>(pq);
            return list.get(k-1);
        }
    }
    public int minNumberOfSemesters(int n, int[][] dependencies, int k) {
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
        for(int i=1;i<=n;i++)
        {
            map.put(i,new HashSet<>());

        }
        for(int[] arr:dependencies)
        {
            map.get(arr[0]).add(arr[1]);
        }
        List<Integer> ans=new ArrayList<>();
        HashSet<Integer> visited=new HashSet<>();
        Stack<Integer> stack=new Stack<>();
        int res=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++)
        {
            if(!visited.contains(i))
            {
                topoSort(i,map,visited,stack);
            }
        }

        while (!stack.empty())
            ans.add(stack.pop());

        // System.out.println(ans);

        HashMap<Integer,HashSet<Integer>> contains=new HashMap<>();
        for(int i=1;i<=n;i++)
        {
            contains.put(i,new HashSet<>());
        }
        HashMap<Integer,Integer> canReach=new HashMap<>();

        for(int i=1;i<=n;i++)
        {
            HashSet<Integer> vis=new HashSet<>();
            dfs(map,vis,i);
            vis.remove(i);
            for(int j:vis)
            {
                contains.get(j).add(i);
            }
            canReach.put(i,vis.size());

        }

        HashMap<Integer,Integer> in=new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++)
        {
            in.put(i,contains.get(i).size());
            max=Math.max(max,in.get(i));
        }

        for(int i:in.keySet())
        {
            System.out.println(i+" -> "+in.get(i));
        }
        HashSet<Integer> done=new HashSet<>();
        int count=0;
        int curr=0;

        List<Integer> mid=new ArrayList<>();
        for(int i=0;i<=max;i++)
        {
            List<Integer> temp=new ArrayList<>();
            for(int j:ans)
            {
                if(in.get(j)==i)
                {
                    temp.add(j);
                }
            }
            temp.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return canReach.get(o2)-canReach.get(o1);
                }
            });
            mid.addAll(temp);
        }
        ans=new ArrayList<>(mid);
        System.out.println("mid="+mid);
        while(done.size()<ans.size())
        {
            List<Integer> l=new ArrayList<>();
            for(int i:ans)
            {
                if(!done.contains(i))
                {
                    int flag=0;
                    for(int j:contains.get(i))
                    {
                        if(!done.contains(j))
                        {
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0)
                    {
                        l.add(i);
                    }
                    if(l.size()==k)
                    {
                        break;
                    }
                }
            }
            if(l.size()>0)
            {
                count++;
                for(int i:l)
                {
                    done.add(i);
                }
            }
            System.out.println(done);

        }
        return count;
    }

    static void dfs(HashMap<Integer,HashSet<Integer>> map,HashSet<Integer> vis,int node)
    {
        vis.add(node);
        // list.add(node);
        for(int i:map.get(node))
        {
            if(!vis.contains(i))
            {
                dfs(map,vis,i);
            }
        }


    }
    static void topoSort(int start,HashMap<Integer,HashSet<Integer>> graph,HashSet<Integer> visited,Stack<Integer> stack)
    {
        visited.add(start);
        // inStack.add(start);
        for(int i:graph.get(start))
        {

            if(!visited.contains(i))
            {
                topoSort(i,graph,visited,stack);
            }
        }
        stack.push(start);
    }
    public int hammingDistance(int x, int y) {
        int count=0;
        for(int i=0;i<32;i++)
        {
            if((x&(1L<<i)) == (y&(1L<<i)))
            {
                count++;
            }
        }
        return count;
    }
    public String minInteger(String num, int k) {
        char[] arr1=num.toCharArray();
        int n=arr1.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Character.getNumericValue(arr1[i]);
        }
        for(int i=0;i<arr.length && k>0;i++)
        {
            int ind=-1;
            int min=Integer.MAX_VALUE;
            for(int j=i;j<Math.min(i+k+1,n);j++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                    ind=j;
                }
            }
            if(ind==i)
            {
                continue;
            }
            k-=ind-i;
            for(int j=ind;j>i;j--)
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }


        }
        StringBuilder res=new StringBuilder();
        for(int i:arr)
        {
            res.append(i);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        StringBuilder ans = new StringBuilder();
//        int t = ri();
        int t=1;
        sieve();
        while (t-- > 0)
        {
            int n=ri();
            HashMap<String,Integer> map=new HashMap<>();
            map.put("AC",0);
            map.put("WA",0);
            map.put("TLE",0);
            map.put("RE",0);
            for(int i=0;i<n;i++)
            {
                String str=rs();
                map.put(str,map.get(str)+1);
            }
            ans.append("AC x ").append(map.get("AC")).append("\n");
            ans.append("WA x ").append(map.get("WA")).append("\n");
            ans.append("TLE x ").append(map.get("TLE")).append("\n");
            ans.append("RE x ").append(map.get("RE")).append("\n");
        }
        out.print(ans.toString());
        out.flush();

    }

}
