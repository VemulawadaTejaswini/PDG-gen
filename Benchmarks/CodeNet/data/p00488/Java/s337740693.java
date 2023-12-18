import java.util.*;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);
	int[] a = new int[5];
	int mn;

	while(sc.hasNext()){
	    mn = 5000;
	    for(int i = 0; i < 5; ++i)
		a[i] = sc.nextInt();

	    for(int i = 0; i < 3; ++i)
		for(int j = 3; j < 5; ++j)
		    mn = Math.min(mn, a[i]+a[j]-50);

	    System.out.printf("%d\n", mn);
	}
    }

    public static void main(String[] args){
	new Main();
    }
}