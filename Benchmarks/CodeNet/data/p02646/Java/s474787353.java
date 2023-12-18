import java.util.*; 

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Long a = sc.nextLong();
		Long v = sc.nextLong();
		Long b = sc.nextLong();
		Long w = sc.nextLong();
		Long t = sc.nextLong();
		
		a = a + (v * t);
		b = b +(w * t);

		a = a + v;
		b = b + t;
		if(a>=b){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	  }
	}		  