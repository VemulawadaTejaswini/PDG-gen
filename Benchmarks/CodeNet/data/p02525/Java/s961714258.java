import java.util.Scanner;
import java.io.*;

public class el1 {

	public static void main(String[] args) {

	  Scanner sc = new Scanner(System.in);

	  while(true)
	  {
	  	int n = sc.nextInt();
	  	if(n == 0) break;
	  	double[] scores = new double[n];
	  
	  	for(int i=0 ; i < scores.length ;i++){
	  		scores[i] = sc.nextDouble();
	  	}
	  
	  	double average =0;
	  	double variance = 0;

	  	for(int i=0 ; i < scores.length ;i++){
	  		average += scores[i]/n;
	  	}

	  	for(int i=0 ; i < scores.length ;i++){
	  		variance += Math.pow( (scores[i]-average) , 2.0)/n;
	  	}

	  	System.out.println(Math.sqrt(variance));
	  }
	
	}

}