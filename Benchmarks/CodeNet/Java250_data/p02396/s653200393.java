import java.io.*;

public class Main{
public static void main(String[] args){
try{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringBuilder sb = new StringBuilder();
	int i = 0;
	while(true){
	i++;
	String str = br.readLine();
	int x = Integer.parseInt(str);
	
		if(x == 0){
		break;
		}

	sb.append("Case ").append(i).append(": ").append(Integer.toString(x)).append("\n");
	}
	
	System.out.print(sb);
}catch(IOException e){
System.out.println(e);
}
}
}