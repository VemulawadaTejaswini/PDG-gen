import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int t = 0,count = 0;
		int b = a;
		while (b>0){
			b = b/10;
			t ++;
		}
		for (int i = 1; i < t; i+=2){
			if (i==1){
				count+=9;
			} else {
				int min=1,max=9,j=i;
				while (j>1){
					min*=10;
					max*=10;
					max+=9;
					j--;
				}
				count+=max-min;
				count++;
			}
		}
		if(t%2==1) {
			int min = 1,j = t;
			while (j>1){
				min*=10;
				j--;
			}
			count+=a-min;
			count++;
		}
		System.out.println(count);
		sc.close();
	}
}