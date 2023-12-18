import java.util.Scanner;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = stdIn.nextInt();
		}

		long stock = 0;
		long money = 1000;
		long yesterdayBoughtStock = 0;
		for(int i=0; i<n; i++){
			stock -= yesterdayBoughtStock;
			money += a[i] * yesterdayBoughtStock;
			if(i+1<n && a[i] < a[i+1]){
				stock += money / a[i];
				yesterdayBoughtStock = money / a[i];
				money -= yesterdayBoughtStock * a[i];
			}else{
				yesterdayBoughtStock = 0;
			}
		}
		System.out.println(money);
    }
}
