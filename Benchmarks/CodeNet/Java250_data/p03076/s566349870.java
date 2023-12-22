import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int time = 0;
		
		int min = 10;
		int sub = 0;
		for(int i = 0; i < a.length; i++) {
			int tmp = a[i]%10;
			
			if( tmp < min && tmp != 0) {
				sub = i;
				min = tmp;
			}
		}
		int tmpi = a[4];
		a[4] = a[sub];
		a[sub] = tmpi;
		
		for(int i = 0; i < a.length-1; i++) {
			if(a[i]%10 == 0) {
				time += a[i];
			}else {
				int tmp = a[i]%10;
				time += a[i] + (10-tmp);
			}
		}
	
			time += a[4];
	
			System.out.println(time);
	}
}
