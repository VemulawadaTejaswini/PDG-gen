import java.io.*;
import java.util.ArrayList;
public class Main{
	public static void main(String args[]){
    int a,b,ans = 0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try{
        String line = reader.readLine();
        String[] splitted = line.split(" ");
          if(Integer.parseInt(splitted[0]) > Integer.parseInt(splitted[1])){
            a = Integer.parseInt(splitted[0]);
            b = Integer.parseInt(splitted[1]);
          }else{
            a = Integer.parseInt(splitted[1]);
            b = Integer.parseInt(splitted[0]);
          }
      
		}catch(Exception e){
      a = 0;
      b = 0;
    }

    while(true){
      ans = b;
      b = a % b;
      a = ans;
      if (b == 0) break;
    }

    System.out.println(ans);

	}
}
