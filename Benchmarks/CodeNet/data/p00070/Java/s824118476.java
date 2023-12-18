import java.util.*;

public class Main
{
    private static int recursive(int sum, int iter, int m, int n, int s){
	if(n == m){
	    if(s == sum){
		return 1;
	    } else {
		return 0;
	    }
	}

	int count = 0;
	for(int i = iter; i <= 9; ++i)
	    count += recursive(sum+i, i+1, m+1, n, s);

	return count;
    }

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    int n = sc.nextInt();
	    int s = sc.nextInt();

	    System.out.printf("%d\n", recursive(0, 0, 0, n, s));
	}
    }
}