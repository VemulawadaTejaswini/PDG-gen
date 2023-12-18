import java.util.Scanner;

public class Main {

    public static void main (String []args){
	Scanner sc = new Scanner(System.in);
	for (;;){
	    int n = sc.nextInt();
	    int x = sc.nextInt();
	    if(n == 0 && x == 0) break;
	    int count = 0;
	
	    OUTER:
	    for(int i = 1;i <= n; ++i){
		for(int j = i + 1;j <= n; ++j){
		    for(int k = j + 1;k <= n; ++k){
			if (i + j >= x) break OUTER;
			if (i + j + k == x) {
			    //			    System.out.printf("%d %d %d\n", i, j, k);
			    ++count;
			    break;
			}
		    }
		}
	    }
	    System.out.println(count);

	}
	sc.close();
    }
}