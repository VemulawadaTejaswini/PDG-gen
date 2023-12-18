import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, a;
    int[] mins;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    mins = new int[3];
	    Arrays.fill(mins, Integer.MAX_VALUE);

	    for(int i=0; i<n; i++){
		a = sc.nextInt();
		int k=2;
		while(k>=0 && mins[k]<a) k++;
		if(k>=0) mins[k] = a;
		Arrays.sort(mins);
	    }

	    Arrays.sort(mins);
	    // System.out.println(mins[0]+" "+mins[1]+" "+mins[2]);
	    System.out.println(mins[1]+""+mins[0]);
	}
    }
}