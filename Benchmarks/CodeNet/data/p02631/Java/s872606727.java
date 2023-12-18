
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
			int n=Integer.parseInt(br.readLine().trim());	
			String[] s=br.readLine().split(" ");
			int[] a=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(s[i].trim());
			}
			
			algo(a,n);
		
	}
	
	public static void algo(int[] a,int n)
	{
		int xor=0;
		for(int x:a) {
			xor=xor^x;
		}
		StringBuffer sb=new StringBuffer();
		for(int x:a) {
			int y=xor^x;
			sb.append(y+" ");
		}
		System.out.println(sb.toString());
		
	}
	

}
