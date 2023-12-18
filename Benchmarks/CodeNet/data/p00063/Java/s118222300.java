import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		int count=0;
		while(sc.hasNext()){
			String str=sc.next();
			boolean ok=true;
			for(int i=0,j=str.length()-1;i<j;i++,j--){
				if(str.charAt(i)!=str.charAt(j)){
					ok=false;break;
				}
			}
			if(ok)count++;
		}
		ln(count);
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