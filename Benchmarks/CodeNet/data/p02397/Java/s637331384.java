import java.io.*;
 
public class Main{
  public static void main(String[] args) throws Exception{
  		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  		StringBuilder sb=new StringBuilder();
  		String[] s=br.readLine().split(" ");
  		while(true){
  			int a=Integer.parseInt(s[0]);
  			int b=Integer.parseInt(s[1]);
  			if(a==0 && b==0) break;
  			sb.append(a>b?a:b).append(" ").append(a<b?a:b).append("\n");
    }
    System.out.println(sb);
  }
}