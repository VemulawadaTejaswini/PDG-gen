import java.io.*;
class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
			String str=br.readLine();
			int n=Integer.parseInt(str);
			int x;
			
			for(int i=3;i<=n;i++){
				if(i%3==0){
					sb.append(" ").append(i);
				}
				else{
					x=i;
					while(x!=0){
						if(x%10==3){
							sb.append(" ").append(i);
							break;
						}
						x/=10;
					}
				}
			}
		System.out.println(sb);
	}
}