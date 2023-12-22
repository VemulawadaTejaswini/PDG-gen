import java.io.*;
class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int i,j,k;
		int ways; 
		
		while(true){
			ways=0;
			String[] num=br.readLine().split(" ");
			int n=Integer.parseInt(num[0]);
			int x=Integer.parseInt(num[1]);
			if(n==0&&x==0){
				break;
			}
			for(i=1;i<=n;i++){
				for(j=1;j<i;j++){
					for(k=1;k<j;k++){
						if((i+j+k)==x){
							ways++;
						}
					}
				}
			}
			sb.append(ways+"\n");
		}
		System.out.print(sb);
	}
}