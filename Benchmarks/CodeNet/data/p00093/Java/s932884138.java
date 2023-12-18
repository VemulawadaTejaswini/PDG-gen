import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		boolean[] isuruu=new boolean[3000];
		for(int i=0;i<3000;i++){
			isuruu[i]=i%400==0 || (i%100!=0 && i%4==0);
		}

		while(true){
			int a=sc.nextInt(),b=sc.nextInt();
			if(a==0 && b==0)break;
			boolean isset=false;
			for(int y=a;y<=b;y++){
				if(isuruu[y]){
					ln(y);
					isset=true;
				}
			}
			if(!isset)ln("NA");
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