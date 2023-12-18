import java.util.*;

//文字操作
class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		int num=0;
		while(sc.hasNext()){
			String str=sc.nextLine();
			int val=0;
			for(int i=0,s=str.length();i<s;i++){
				if('0'<=str.charAt(i)&& str.charAt(i)<='9'){
					val=val*10+str.charAt(i)-'0';
				}else{
					num+=val;
					val=0;
				}
			}
			num+=val;
		}
		ln(num);
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