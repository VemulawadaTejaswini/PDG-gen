import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(sc.hasNext()){
			String str=sc.next();
			int[] vals=new int[10];
			for(int i=0;i<10;i++){
				vals[i]=str.charAt(i)-'0';
			}
			ln((vals[0]+vals[1]*9+vals[2]*36+vals[3]*84+vals[4]*126
			+vals[5]*126+vals[6]*84+vals[7]*36+vals[8]*9+vals[9])%10);
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