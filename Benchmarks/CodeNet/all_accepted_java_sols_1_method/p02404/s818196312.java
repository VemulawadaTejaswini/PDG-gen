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
			 	if(i == 0 || i == H-1){
					for(int n = 0; n < W; n++){
				 	 sb.append("#");
					}
				}else{
				sb.append("#");
					for(int j = 1; j < W-1; j++){
					 sb.append(".");
					}
				sb.append("#");
				}
			 sb.append("\n");
			}
		}
	sb.append("\n");
	}
System.out.print(sb);

}catch(IOException e){
System.out.println(e);
}
}
}