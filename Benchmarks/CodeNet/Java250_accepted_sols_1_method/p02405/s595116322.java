import java.io.*;

public class Main{
public static void main(String[] args){
try{
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 StringBuilder sb = new StringBuilder();

	while(true){
	 String[] str = br.readLine().split(" ");
	 int H = Integer.parseInt(str [0]);
	 int W = Integer.parseInt(str [1]);

		if(H == 0 || W == 0){
		 break;
		}else{
			for(int i = 0; i < H; i++){
			 	if(i % 2 == 0){
					for(int n = 0; n < W; n++){
				 	 	if(n % 2 == 0){
						 sb.append("#");
					        }else{
						 sb.append(".");
						}
					}
				}
			 	if(i % 2 == 1){
					for(int n = 0; n < W; n++){
				 	 	if(n % 2 == 0){
						 sb.append(".");
					        }else{
						 sb.append("#");
						}
					}
				}
			sb.append("\n");
			}
		sb.append("\n");
		}
	}
System.out.print(sb);

}catch(IOException e){
System.out.println(e);
}
}
}