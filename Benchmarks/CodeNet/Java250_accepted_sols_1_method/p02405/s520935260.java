import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		while(true){
			String[] ary=br.readLine().split(" ");
			int H=Integer.parseInt(ary[0]);
	        int W=Integer.parseInt(ary[1]);
			if(H==0&&W==0) break;
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					if(i%2==0){
						if(j%2==0){
							sb.append('#');
						}else{
							sb.append('.');
						}
					}else{
						if(j%2==0){
							sb.append('.');
						}else{
							sb.append('#');
						}
					}
				}
				sb.append('\n');
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
}