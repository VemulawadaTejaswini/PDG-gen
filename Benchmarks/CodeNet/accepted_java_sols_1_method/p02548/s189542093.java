import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int a=1,b=1,c=1;
	int sum=0;
	
	for(a=1; a<N; a++){
	    if(a*a>=N)break;
	    for(b=a; b<N; b++){
		if(a*b>=N)break;
		else if(a*b<N){
		    if(a==b)sum++;
		    else sum+=2;
		}
	    }
	}	
	System.out.println(sum);
    }
}