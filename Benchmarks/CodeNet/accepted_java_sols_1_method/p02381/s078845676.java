import java.util.Scanner;

public class Main{
  public static void main(String args[]){
try(Scanner sc =new Scanner(System.in)){
    while(true){
        int n = sc.nextInt();
        if(n==0){break; }
        int[]scores=new int[n];
        for(int i =0;i<scores.length;i++){
            scores[i]=sc.nextInt();
        }
		double average =0.0, variance =0.00,suum=0.0;
        int sum=0;
        for(int i=0;i<scores.length;i++){
         sum = sum+scores[i];
        }
        average=(double)sum/n;
        for(int i=0;i<n;i++){
            double j = (double)scores[i]-average;
			suum = suum+j*j;
        }
        variance =(double)suum/scores.length;
        System.out.printf("%.8f\n",Math.sqrt(variance));
    }
    }
}
  }


