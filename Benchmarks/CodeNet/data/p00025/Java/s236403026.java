import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int [] a = new int [10];
			int h = 0;
			int b = 0;
			
			for(int i=1;i<=4;i++) {
				a[sc.nextInt()]=i;
			}
			for(int i=1;i<=4;i++) {
				int c = sc.nextInt();
				if(i==a[c])h++;
				else if(a[c]>0)b++;
			}
			System.out.println(h+" "+b);
		}
	}
}

