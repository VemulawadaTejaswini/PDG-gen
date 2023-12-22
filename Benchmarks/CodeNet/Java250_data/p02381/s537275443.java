import java.io.*;
import java.util.ArrayList;
import java.*;
public class Main{
	public static void main(String args[]){
    double a=0,b=0,c=0,i=0,n=0,j=0,m=0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



    while(true){
    try{
      i = 0;
      String line = reader.readLine();
      n = Double.parseDouble(line);
      if (n == 0.0) {
        break;
      }
      Double bar[] = new Double[(int)n];
      line = reader.readLine();
      for(String splitted: line.split(" ")){
        bar[(int)i] = Double.parseDouble(splitted);
        i++;
      }
      a = 0;
      for(b=0;b<n;b++){
        a += bar[(int)b];
      }
      m = a / n;

      c = 0;
      for(b=0;b<n;b++){
        c += Math.pow((bar[(int)b] - m),2);
      }
      j = c / n;
      System.out.println(String.format("%.8f", Math.sqrt(j)));
      





		}catch(Exception e){
      break;
    }





  }



  
	}
}
