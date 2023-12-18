import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=N;i++){
			int x=i;
			if(x%3==0||check3(i, Integer.toString(i).length())) sb.append(" "+i);
		}
		System.out.println(sb);
	}
	
	private static boolean check3(int n, int k){
		boolean res=false;
		int t=(int)Math.pow(10, k-1);
		if(n/t==3){
			res=true;
		}else if(k>1){
			res=check3(n%t, k-1);
		}
		return res;
	}
}