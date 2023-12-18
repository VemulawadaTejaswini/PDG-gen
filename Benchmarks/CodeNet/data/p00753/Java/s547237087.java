import java.util.*;

class Main{
    public static void main(String[] agrs){
	Scanner sc = new Scanner(System.in);

	while(true){
	    int n = sc.nextInt();

	    if(n==0)break;

	    int c=0;
	    for(int i=n+1;i<=2*n;i++){
		if( prim(i) ) c++;
	    }
	    System.out.println( c );
	}
	
    }

    static boolean prim(int n){
	for(int i=2;i<=Math.sqrt(n);i++){
	    if(n%i==0) return false;
	}
	return true;
    }
}