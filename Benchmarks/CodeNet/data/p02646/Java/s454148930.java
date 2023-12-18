import java.util.*; 

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Long a = sc.nextLong();
		Long v = sc.nextLong();
		Long b = sc.nextLong();
		Long w = sc.nextLong();
		Long t = sc.nextLong();
		Long d = 0;
	    d = Math.abs(a - b);
		v = (v - w) * t;
		
		if(d<=v){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	  }
	}		  