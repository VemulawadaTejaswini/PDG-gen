import java.util.Scanner;
public class Main {
	static Scanner scan=new Scanner(System.in);
	static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
	static long lcm (int a, int b) {return a*b/gcd(a,b);}
	static int max(int a,int b) {return a>b?a:b;}
	static int min(int a,int b) {return a<b?a:b;}
	static long factorial(int i) {return i==1?1:i*factorial(i-1);}
	static int lower_bound(int a[],int key) {
		int low=0,high=a.length;
		while(low<high) {
			int mid=((high-low)/2)+low;
			if(a[mid]<=key)low=mid+1;
			else high=mid;
		}
		return high;
		}
	static int upper_bound(int a[],int key) {
		int low=0,high=a.length;
		while(low<high) {
			int mid=((high-low)/2)+low;
			if(a[mid]<key)low=mid+1;
			else high=mid;
		}
		return high;
		}
	static boolean isPrime (int n) {
		if (n==2) return true;
		if (n<2 || n%2==0) return false;
		double d = Math.sqrt(n);
		for (int i=3; i<=d; i+=2)if(n%i==0){return false;}
		return true;
	}
		public static void main(String[] args) {
			String str=scan.next();
			char ch1=str.charAt(0);
			char ch2=str.charAt(1);
			char ch3=str.charAt(2);
			char ch4=str.charAt(3);
			if(ch1==ch2&&ch1==ch3&&ch1==ch4) {
				System.out.println("No");
				return;
			}
			if(ch1==ch2) {
				if(ch3==ch4) {
					System.out.println("Yes");
					return;
				}
			}
			else if(ch1==ch3) {
				if(ch2==ch4) {
					System.out.println("Yes");
					return;
				}
			}
			else if(ch1==ch4) {
				if(ch2==ch3) {
					System.out.println("Yes");
					return;
				}
			}
			else if(ch2==ch3) {
				if(ch1==ch4) {
					System.out.println("Yes");
					return;
				}
			}
			else if(ch2==ch4) {
				if(ch1==ch3) {
					System.out.println("Yes");
					return;
				}
			}
			else if(ch3==ch4) { 
				if(ch1==ch2) {
					System.out.println("Yes");
					return;
				}
			}
			System.out.println("No");
		}
}
