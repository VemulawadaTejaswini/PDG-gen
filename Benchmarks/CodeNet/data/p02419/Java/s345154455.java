import java.util.Scanner;

class Main {
	Scanner sc = new Scanner(System.in);

	int[] count = new int[26];

	public void run() {
		String s=sc.nextLine().toLowerCase();
		int count=0;
		while(true){
			String str = sc.nextLine().toLowerCase();
			if("end_of_text".equals(str))break;
			for(int i = 0; i <str.length()-s.length(); i++) {
				if(s.equals(str.substring(i,i+s.length()))){
					count++;
				}
			}
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