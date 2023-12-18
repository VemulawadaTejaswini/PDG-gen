import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			boolean[] odd=new boolean[101];
			while(true){
				int f=sc.nextInt(),t=sc.nextInt();
				if(f==0 && t==0) break;
				odd[f]=!odd[f];
				odd[t]=!odd[t];
			}
			boolean ok=true;
			ok&=odd[1]&&odd[2];
			for(int i=3;i<=100;i++){
				ok&=!odd[i];
			}
			ln(ok?"OK":"NG");
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