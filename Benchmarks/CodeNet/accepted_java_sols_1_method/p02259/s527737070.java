import java.util.*;

public class Main{
    private int n, cnt, tmp;
    private int[] a;

    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    n = sc.nextInt();

	    a = new int[n];
	    cnt = 0;
	    for(int i = 0; i < n; ++i)
		a[i] = sc.nextInt();

	    for(int i = 0; i < n; ++i)
		for(int j = n-1; j > i; --j)
		    if(a[j] < a[j-1]){
			tmp = a[j];
			a[j] = a[j-1];
			a[j-1] = tmp;
			++cnt;
		    }

	    for(int i = 0; i < n-1; ++i)
		System.out.printf("%d ", a[i]);
	    System.out.println(a[n-1]);
	    System.out.printf("%d\n", cnt);
	}
    }

    public static void main(String[] args){
	new Main();
    }
}