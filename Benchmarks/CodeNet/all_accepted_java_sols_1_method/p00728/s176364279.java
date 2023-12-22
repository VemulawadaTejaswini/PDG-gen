import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        while(true){
	    int n= sc.nextInt();
	    if(n==0)break;
	    int[] scores=new int[n];
	    for(int i=0;i<n;i++){
		scores[i]=sc.nextInt();
	    }
	    int sum=scores[0]+scores[1];
	    int max;
	    int min;
	    if(scores[0]>scores[1]){
		max=scores[0];
		min=scores[1];
	    }
	    else{
		max=scores[1];
		min=scores[0];
	    }
	    for(int i=2;i<n;i++){
		if(scores[i]>max) max=scores[i];
		if(scores[i]<min) min=scores[i];
		sum+=scores[i];
	    }
	    sum-=(max+min);
	    System.out.println(sum/(n-2));
	}
    }
}