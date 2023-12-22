import java.util.Scanner;

public class Main{
  public static void main(String[]args){

  	Scanner sc = new Scanner(System.in);
  	while(true){
  		int i;
  		int n=sc.nextInt();
  		if(n==0){break;}

  		int[] scores=new int[n];

  		for(i=0;i<scores.length;i++){
  			scores[i]=sc.nextInt();
  		}

  		double average=0,variance=0;

  		for(i=0;i<scores.length;i++){
  			average+=scores[i];
  		}
  		average/=scores.length;

  		for(i=0;i<scores.length;i++){
  			variance+=(scores[i]-average)*(scores[i]-average);
  		}
  		variance=Math.sqrt(variance/scores.length);

  		System.out.println(variance);
  	}
  }
}