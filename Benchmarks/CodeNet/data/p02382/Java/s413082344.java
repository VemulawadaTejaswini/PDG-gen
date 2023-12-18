
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


   String st = br.readLine();

   int n = Integer.parseInt( st );
   double[] abs = new double[n];
   String[] x = br.readLine().split(" ");
   String[] y = br.readLine().split(" ");

   double p1 = 0;
   for(int i = 0 ;i < n; i++){

	   abs[i] = Math.abs( Double.parseDouble(x[i]) - Double.parseDouble(y[i]) );
	   p1 += abs[i];

   }
   System.out.println(p1);

   double sum = 0;
   for(int i = 0 ;i < n; i++){

	   sum += Math.pow(Math.abs( Double.parseDouble(x[i]) - Double.parseDouble(y[i]) ) , 2);

   }
   double p2 = Math.sqrt(sum);
   System.out.println(p2);

   double sum2 = 0;
   for(int i = 0 ;i < n; i++){

	   sum2 += Math.pow(Math.abs( Double.parseDouble(x[i]) - Double.parseDouble(y[i]) ) , 3);

   }

  double triple = 1/3;
   double p3 = Math.pow(sum2 , 1.0 / 3.0);
   System.out.println(p3);


   double Ch = abs[0];
   for(int j = 0 ;j < n; j++){
     if(Ch < abs[j]){
       Ch = abs[j];
     }
   }
   System.out.println(Ch);

  }
}