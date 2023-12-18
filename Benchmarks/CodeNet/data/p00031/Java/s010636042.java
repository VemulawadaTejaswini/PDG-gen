import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);
	
	int n;
	public void run() {
		while(sc.hasNext()){
			n=sc.nextInt();
			int d=0;boolean isFirst=true;
			while(n!=0){
				if(n%2==1){
					pr((isFirst?"":" ")+(1<<d));
					isFirst=false;
				}
				d++;
				n/=2;
			}
			ln();
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
} 