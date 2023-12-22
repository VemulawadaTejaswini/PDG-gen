import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		char p='#',n='\n';
		while(true){
			String s=br.readLine();
			if(s.equals("0 0")) break;
			String[] a=s.split(" ");
			int H=Integer.parseInt(a[0]);
	        int W=Integer.parseInt(a[1]);
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					sb.append(p);
				}
				sb.append(n);
			}
			sb.append(n);
		}
		System.out.print(sb);
	}
}