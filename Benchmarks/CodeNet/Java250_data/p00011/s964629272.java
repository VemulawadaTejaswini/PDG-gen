
import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		int w=sc.nextInt();
		int n=sc.nextInt();
		int [] data=new int[w+1];
		for(int i=1;i<=w;i++){
			data[i]=i;
		}
		
		for(int i=0;i<n;i++){
			String bar=sc.next();
			String[] bs=bar.split(",");
			int a1=Integer.parseInt(bs[0]);
			int a2=Integer.parseInt(bs[1]);
			int tmp=data[a1];
			data[a1]=data[a2];
			data[a2]=tmp;
		}
		
		for(int i=1;i<=w;i++){
			ln(data[i]);
		}
	}
	public static String join(double[] array, String separator) {
		StringBuilder str = new StringBuilder(array[0] + "");
		for (int i = 1; i < array.length; i++) {
			str.append(separator).append(array[i] + "");
		}
		return str.toString();
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