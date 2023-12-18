import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	while(true){
	    int n=sc.nextInt();
	    if(n==0){
		break;
	    }
	    int [] scores=new int[n];
	    for(int i=0;i<scores.length;i++){
		scores[i]=sc.nextInt();
		}
        double sum=0;
	    double a,v=0;
	    for(int j=0;j<n;j++){
            sum += scores[j];}
         a=sum/n;
        for(int j=0;j<n;j++)
            v+= (Math.pow(scores[j]-a,2))/n;
        System.out.println(Math.sqrt(v));
	}
    }
}