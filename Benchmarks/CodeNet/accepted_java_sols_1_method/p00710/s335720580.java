import java.io.*;
import java.util.ArrayList;
public class Main{
	public static void main(String args[]){
    int a=0,b=0,c=0,d=0,i=0,n=0,m=0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int hana1[] = new int[51];
    int hana2[] = new int[51];



    while(true){
    try{
      String line = reader.readLine();
      String[] splitted = line.split(" ");
      a = Integer.parseInt(splitted[0]);
      b = Integer.parseInt(splitted[1]);
      for (i=1;i<=a;i++){ 
        hana1[i] = a - i + 1;
      }
      if (a+b == 0) break;
      for(m=0;m<b;m++){
        line = reader.readLine();
        splitted = line.split(" ");
        c = Integer.parseInt(splitted[0]);
        d = Integer.parseInt(splitted[1]);
        for(i=c;i<c+d;i++) hana2[i-c+1] = hana1[i];
        for(i=1;i<c;i++) hana2[i+d] = hana1[i];
        for(i=1;i<c+d;i++) hana1[i] = hana2[i];
      }
      System.out.println(hana1[1]);



		}catch(Exception e){
      break;
    }





  }



  
	}
}
