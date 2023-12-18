import java.io.*;

public class Main{
public static void main(String[] args){
try{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringBuilder sb = new StringBuilder();
	int i = 0;
	while(true){
	i++;
	String[] str = br.readLine().split(" ");
		
	int x = Integer.parseInt(str[0]);
	int y = Integer.parseInt(str[1]);

		if(x == 0 || y == 0){
		break;
		}else if(x < y){
		sb.append(x).append(" ").append(y).append("\n");
		}else{
		sb.append(y).append(" ").append(x).append("\n");
		}	
	}
	System.out.println(sb);
}catch(IOException e){
System.out.println(e);
}
}
}