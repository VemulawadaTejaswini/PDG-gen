import java.io.*;
public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String str=input.readLine();
		int n=Integer.parseInt(str);
		int ii=0;
		for(int i=0;i<=n;i++){
			if(!(i==0)){
				if(i%3==0){
					sb.append(" ").append(i);
					}else{
						 ii=i;
						while(!(ii==0)){
							if(ii%10==3){
								sb.append(" ").append(i);
								break;
							}
							ii/=10;
						}
					}
				}		
			}	
		
		System.out.println(sb);
	}
}