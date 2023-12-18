import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    boolean[] canMake;
    int n, m;
    double count, sum;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    m = sc.nextInt();
	    if(n==0 && m==0) break;

	    canMake = new boolean[n+1];
	    Arrays.fill(canMake, true);
	    canMake[0] = false;
	    for(int i=0; i<m; i++){
		int no = sc.nextInt();
		for(int k=no; k<canMake.length; k+=no)
		    canMake[k] = false;
	    }

	    count = 0; 
	    sum = 0;
	    for(int i=1; i<canMake.length; i++)
		if(canMake[i]){
		    sum += i;
		    count++;
		}

	    System.out.println(count>0 ? sum/count : "0.0");
	}
    }
}
	   