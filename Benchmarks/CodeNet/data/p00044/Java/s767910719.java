import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int MAX = 100000;

	int[] p = new int[MAX];
	for(int i=2; i<p.length; i++){p[i] = 1;}
	for(int i=2; i<Math.sqrt(MAX)+1; i++){
	    for(int j=i*2; j<MAX; j+=i){
		p[j] = 0;
	    }
	}

	while(sc.hasNext()){
	    int n = sc.nextInt();
	    int max = n;
	    int min = n;
	    
	    for(int i=n-1; i>=0; i--){
		if(p[i]==1){max = i; break;}
	    }
	    for(int i=n+1; i<MAX; i++){
		if(p[i]==1){min = i; break;}
	    }
	    
	    System.out.println(max+" "+min);
	}
    }
}