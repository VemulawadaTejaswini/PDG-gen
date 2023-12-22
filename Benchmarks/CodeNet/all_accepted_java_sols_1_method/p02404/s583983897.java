import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		char s='#',p='.',n='\n';
		while(true){
			String in=br.readLine();
			if(in.equals("0 0")) break;
			String[] a=in.split(" ");
			int H=Integer.parseInt(a[0]);
	        int W=Integer.parseInt(a[1]);
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					if(i!=0&&i!=H-1&&j!=0&&j!=W-1){
						sb.append(p);
					}else{
						sb.append(s);
					}
				}
				sb.append(n);
			}
			sb.append(n);
		}
		System.out.print(sb);
	}
}