	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int M = sc.nextInt();
	        int[] a = new int[M];
	        int[] b = new int[M];
	        for(int i=0;i<N;i++)list.add(new ArrayList<Integer>());
	        for (int i=0 ; i<M; i++) {
	            a[i] = Integer.parseInt(sc.next())-1;
	            b[i] = Integer.parseInt(sc.next())-1;
	        	list.get(a[i]).add(b[i]);
	        	list.get(b[i]).add(a[i]);
	        }
	        int[] visited = new int[N];
	        LinkedList<Integer> q= new LinkedList<Integer>();
	        q.add(0);
	        q.add(-1);
	        while(!q.isEmpty()) {
	        	int now = q.poll();
	        	int pre = q.poll();
//        		visited[now]=pre+1;
	        	for(int i=0;i<list.get(now).size();i++) {
	        		int next = list.get(now).get(i);
	        		if(next==pre)continue;
	        		if(visited[next]!=0)continue;
	        		q.add(next);
	        		q.add(now);
	        		visited[next]=now+1;
	        	}
	        }
	        System.out.println("Yes");
	        for(int i=1;i<N;i++) {
	        	System.out.println(visited[i]);
	        }
	       
	    }

	}