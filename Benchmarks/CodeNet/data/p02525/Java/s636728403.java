import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	while(true){
	    int n = sc.nextInt();
	    if(n==0){
		break;
	    }
	    int[] scores = new int[n];
	    for(int i=0;i<scores.length;i++){
		scores[i] = sc.nextInt();
		
	    }
	    double average =0,variance=0;

	    for(int k=0;k<scores.length;k++){
		average=average + scores[k];
	    }
	    average=average/scores.length;

	   

	    for(int l=0;l<scores.length;l++){
		variance+=(scores[l]-average)*(scores[l]-average);
		
	    }
	    variance = variance / scores.length;
	    System.out.println(Math.sqrt(variance));
	}

      
	
    }

}    