import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastReader s = new FastReader();
	
		int n = s.nextInt();
		int[] inp = new int[n];
		
		Set<Integer> set = new HashSet<>();
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<n;++i)
		{
			inp[i] = s.nextInt();
			map.put(inp[i], map.getOrDefault(inp[i], 0)+1);
			set.add(inp[i]);
		}
		int ans = 0;
		for(int i=0;i<n;++i)
		{
			for(int j=1;j<=Math.sqrt(inp[i]);++j)
			{
				if(inp[i]%j == 0)
				{
					if(j==1)
					{
						if(map.get(inp[i]) > 1)
						{
							ans++;
							break;
						}
						
						if(set.contains(j) && inp[i]!=1)
						{
							ans++;
							break;
						}
							
					}
					else
					{
						if(set.contains(j))
						{
							ans++;
							break;
						}
						if(set.contains(inp[i]/j))
						{
							ans++;
							break;
						}
					}
				}
			}
		}
		
		System.out.println(n-ans);
	}
	
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
	}

}
