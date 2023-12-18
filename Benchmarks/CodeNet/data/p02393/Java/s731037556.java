import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
    try {
      BufferedReader stdReader =
        new BufferedReader(new InputStreamReader(System.in));
      String line0;
      line0 = stdReader.readLine();
 
      String Array[]=line0.split(" ");
      int a =Integer.parseInt(Array[0]);
      int b =Integer.parseInt(Array[1]);
      int c =Integer.parseInt(Array[2]);
      int abc[]={a,b,c};
      if(abc[1]<abc[0]){
       abc[0]=abc[1];
       abc[1]=abc[0];      
      }
       

      if(abc[2]<abc[1]){
       abc[1]=abc[2];
       abc[2]=abc[1];      
      }

      if(abc[1]<abc[0]){
       abc[0]=abc[1];
       abc[1]=abc[0];      
      }
      
System.out.println(abc[0]+" "+abc[1] +" "+abc[2]);       
      stdReader.close();
    }catch(

	Exception e)
	{
		e.getStackTrace();
		/* ??????´??????0?????? */
		System.exit(0);
	}
}}