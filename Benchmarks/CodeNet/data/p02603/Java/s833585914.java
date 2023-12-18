import java.util.*;

public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] a = new int[N];
	for (int i=0; i<N; i++) a[i] = sc.nextInt();
	int kabu = 0;
	int money = 1000;
	int maxMoney = 1000;
	int firstBuy = 0;
	for (int i=0; i<N-1; i++) {
	    if (a[i] > a[i+1]) continue;
	    if (a[i] <= a[i+1]) {firstBuy = i; break;}
	}

	
	kabu = (int)(money/a[firstBuy]);
	money -= a[firstBuy]*kabu;
	for (int i=firstBuy+1; i<N; i++) {
	    if (i!=N-1) {
		if (a[i] > a[i-1]) {
		    if (a[i+1] <= a[i]) {
			money += kabu * a[i];
			kabu = 0;
		    }
		} else if (a[i] < a[i-1]) {
		    if (a[i+1] >= a[i]) {
			kabu = (int)(money/a[i]);
			money -= a[i]*kabu;
		    }
		}
	    }
	    if (i == N-1) {
		money += a[i]*kabu;
		kabu = 0;
	    }
	}
	if (money > maxMoney) System.out.print(money);
	else { System.out.print(maxMoney); }
    }
}
