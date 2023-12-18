import java.io.*;
 
public class Main{
  public static void main(String[] args) throws Exception{
  		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  		StringBuilder sb=new StringBuilder();
  		String[] s=br.readLine().split(" ");
  		while(true){
  			int x=Integer.parseInt(s[0]);
  			int y=Integer.parseInt(s[1]);
  			if(x==0 && y==0) break;
  			sb.append(x>y?x:y).append(" ").append(x<y?x:y).append("\n");
    }
    System.out.println(sb);
  }
}