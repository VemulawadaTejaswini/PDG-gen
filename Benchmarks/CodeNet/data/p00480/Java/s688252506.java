import java.util.Scanner;
import java.math.BigDecimal;

public class Main{
    BigDecimal[][] memo;
    BigDecimal one = new BigDecimal(1);
    BigDecimal zero = new BigDecimal(0);

    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    int n = sc.nextInt(), s;
	    if(n == 0){
		break;
	    }
	    int[] a = new int[n];
	    for(int i = 0; i < n-1; i++){
		a[i] = sc.nextInt();
	    }
	    s = sc.nextInt();
	    BigDecimal c = zero;
	    memo = new BigDecimal[21][];
	    for(int i = 0; i < 21; i++){
		memo[i] = new BigDecimal[n];
		for(int j = 0; j < n; j++){
		    memo[i][j] = new BigDecimal(-1);
		}
	    }

	    c = func(a, n-1, s, 1, a[0]);
	    System.out.println(c.toString());
	}
    }

    BigDecimal func(int[] a, int n, int s, int p, int t){
	if(p == n){
	    if(t == s){
		return one;
	    } else {
		return zero;
	    }
	}
	if(!(new BigDecimal(-1)).equals(memo[t][p])){
	    return memo[t][p];
	}
	BigDecimal bd = new BigDecimal("0");
	if(t-a[p] >= 0){
	    bd = bd.add(func(a, n, s, p+1, t-a[p]));
	}
	if(t+a[p] <= 20){
	    bd = bd.add(func(a, n, s, p+1, t+a[p]));
	}
	memo[t][p] = bd;
	
	return bd;
    }

    public static void main(String[] args){
	new Main();
    }
}