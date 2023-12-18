import java.util.*; 

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Long a = sc.nextInt();
		Long v = sc.nextInt();
		Long b = sc.nextInt();
		Long w = sc.nextInt();
		Long t = sc.nextInt();
		
		a = a + (v * t);
		b = b + (w * t);

		if(a>=b){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	  }
	}	