import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int a1 = cin.nextInt();
			int m1 = cin.nextInt();
			int a2 = cin.nextInt();
			int m2 = cin.nextInt();
			int a3 = cin.nextInt();
			int m3 = cin.nextInt();
			if(a1==0){
				break;
			}
			int x,y,z;
			x=y=z=1;
			int count1=1,count2=1,count3=1;
			while(true){
				y = (a2 * y)  % m2;
				if(y==1){
					
					break;
				}
				count2++;
			}
			while(true){
				z = (a3 * z)  % m3;
				if(z==1){
					break;
				}
				count3++;
			}
		
			while(true){
				x = (a1 * x)  % m1;
				if(x==1){
					break;
				}
				count1++;
			}
			System.out.println(lcm(lcm(count1, count2), count3));
		}
	}
	static int lcm(int a , int b){
		return a*b/gcm(a, b);
	}
	static int gcm(int a, int b){
		if(a < b){
			int tmp = a;
			a =b;
			b = tmp;
		}
		if(b == 0){
			return a;
		}
		return gcm(b, a%b);
	}
}