import java.io.*;
 
public class Main{
  public static void main(String[] args) throws Exception{
  		int i=1;
  		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  		StringBuilder sb=new StringBuilder();
  		while(true){
  			int inputNum=Integer.parseInt(br.readLine());
  			if(inputNum==0) break;
  			sb.append("Case ").append(i).append(": ").append(inputNum).append("\n");
  			i++;
    }
    System.out.println(sb);
  }
}