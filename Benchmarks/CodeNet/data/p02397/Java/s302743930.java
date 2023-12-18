import java.io.*;
import java.util.*;
 
public class Main{
  public static void main(String[] args) throws Exception{
  		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  		StringBuilder sb=new StringBuilder();
  		String s=br.readLine();
  		String[] spl=s.split(" ");
  		while(true){
  			// for(int i=0;i<=spl.length;i++){
  			// 	Integer.parseInt(spl[i]);
  			// }
  			if(spl[0].equals("0")&&spl[1].equals("0")) break;
  			Arrays.sort(spl);
  			sb.append(spl[0]).append(" ").append(spl[1]).append("\n");
    }
    System.out.println(sb);
  }
}