import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1);
	  String str = br.readLine();
	  int len = Integer.parseInt(str); 
	  str = br.readLine();
	  String[] splitStr = str.split(" ");
	  
	  int target[] = new int[len];
	  
	  for(int i = 0;i<len;i++){
	   target[i] = Integer.parseInt(splitStr[i]);
	  }

	  for(int i = 1;i<len;i++){
	   int cash = target[i];
	   int num = i-1;
	   while(num>= 0 && target[num] > cash){
	    target[num+1] = target[num];
	    num--;
	    target[num+1] = cash;
	   }
	   StringBuffer sb = new StringBuffer();
	   for(int v = 0; v < len;v++){
	    sb.append(target[v]);
	    if(v != len){
	     sb.append(" ");
	    }else {
	     sb.append("\n");
	    }
	   }
	   System.out.println(sb);
	  }
	}
}