import java.util.Scanner;

public class Main{
	public static void main(String[] arg){
  		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	double[] x = new double[n];
      	double[] y = new double[n];
      	double len = sc.nextInt();
      int count = 0;
      for (int i=0;i<n;i++){
        x[i] = sc.nextDouble();
        y[i] = sc.nextDouble();
        if (Math.sqrt(Math.pow(x[i],2)+Math.pow(y[i],2))<=len){
          count = count+1;
        }
      }
          System.out.println(count);
        
    }
}