import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int t;
		outer:
		if(b > a){
			if(c > b){
				break outer;
			}
				else{
					t = b;
					b = c;
					c = t;
				}
		}
		else if(a > b){
			if(a > c){
				t = a;
				a = c;
				c = t;
				if(a > b){
					t = a;
					a = b;
					b = t;
				}
			}
			else{
				t = a;
				a = b;
				b = t;
			}
		}
		System.out.printf("%d %d %d\n",a ,b ,c);
	}
}