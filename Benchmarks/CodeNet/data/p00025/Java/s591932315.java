import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while (sc.hasNext()) {
			int[] a=new int[4],b=new int[4];
			for(int i=0;i<4;i++){
				a[i]=sc.nextInt();
			}
			for(int i=0;i<4;i++){
				b[i]=sc.nextInt();
			}
			int hit=0,blow=0;
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(a[i]==b[j]){
						if(i==j)hit++;
						else blow++;
					}
				}
			}
			ln(hit +" "+blow);
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