import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	
	String[] day=new String[]{
			"Sunday",
			"Monday",
			"Tuesday",
			"Wednesday",
			"Thursday",
			"Friday",
			"Saturday",
	};
	public void run() {
		while (true) {
			int m=sc.nextInt(),d=sc.nextInt();
			if(m==0 && d==0)break;
			Calendar cl=Calendar.getInstance();
			cl.set(2004,m-1,d);
			ln(day[cl.get(Calendar.DAY_OF_WEEK)-1]);
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