import java.util.*;

public class Main
{
    private static int recursive(int sum, int m, int n, int s, boolean[] used){
	if(n == m){
	    if(s == sum){
		return 1;
	    } else {
		return 0;
	    }
	}

	if(s < sum){
	    return 0;
	}

	int count = 0;
	for(int i = 0; i <= 9; ++i){
	    if(!used[i]){
		used[i] = true;
		count += recursive(sum+i*(m+1), m+1, n, s, used);
		used[i] = false;
	    }
	}
	return count;
    }

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	boolean[] used = new boolean[10];

	while(sc.hasNext()){
	    int n = sc.nextInt();
	    int s = sc.nextInt();

	    System.out.printf("%d\n", recursive(0, 0, n, s, used));
	}
    }
}