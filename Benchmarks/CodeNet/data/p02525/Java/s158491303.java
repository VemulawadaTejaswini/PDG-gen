import java.util.Scanner;
public class deviation{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	double s=0.0;
	while(true){
	    int t=0;
	    int n=sc.nextInt();
	    if(n==0){
		break;
	    }else{
	 
	    int[] scores=new int[n];
	    for(int i=0;i<scores.length;i++){
		scores[i]=sc.nextInt();
		t=t+scores[i];
	    }
	    double average=0.0,variance=0.0;
	    average=(double)t/(double)n;
	    
	    for(int i=0;i<scores.length;i++){
		s=s+((double)scores[i]-average)*((double)scores[i]-average);
	    }
	    variance=s/(double)n;
	    System.out.printf("%.8f",Math.sqrt(variance));
	    }
	}

    }
}