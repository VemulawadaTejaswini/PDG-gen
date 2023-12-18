import java.util.*;


//素数探索
class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		int sum=0,count=0;
		while (sc.hasNext()) {
			String[] data=sc.next().split(",");
			sum+=Integer.parseInt(data[0])*Integer.parseInt(data[1]);
			count+=Integer.parseInt(data[1]);
		}
		ln(sum);
		ln(Math.round((double)sum/count));
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