import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] menu = new int[5];
		int max=0;
		int mvalue=0;
		for(int i=0;i<5;i++) {
			menu[i]=sc.nextInt();
          int temp=10-menu[i]%10;
          
			if(temp>mvalue && temp!=10) {
				max=i;
				mvalue=temp;
			}
		}
		int count=0;
		for(int i=0;i<5;i++) {
			if(i==max) continue;
			int temp = 10-menu[i]%10;
			if(temp!=10) {
			count+=menu[i]+10-menu[i]%10;
			}else {
				count+=menu[i];
			}
		}
		count+=menu[max];
		System.out.println(count);
	}
}
