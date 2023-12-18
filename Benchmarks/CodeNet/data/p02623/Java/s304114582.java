import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> strList = new ArrayList<String>();
	static ArrayList<String> strList2 = new ArrayList<String>();
	static ArrayList<Integer> intList = new ArrayList<Integer>();
	static HashMap<String,Integer> Hmap = new HashMap<String,Integer>();
	public static void main(String[] args) {

		String str1 = sc.nextLine();
		String[] strArray1 = str1.split(" ");

		int a = Integer.parseInt(strArray1[0]);
		int b = Integer.parseInt(strArray1[1]);
		int c = Integer.parseInt(strArray1[2]);
		int d = 0;

		int num1=0;
		int num2=0;

		int i=0;
		int y=0;

		int x=0;
		int w=0;

		for(i=0; i< a; i++) {
			//int sum = sc.nextInt();
			String str = sc.next();
			int cheng = Integer.parseInt(str);
			if(c >= cheng ) {
				num1 = num1 + cheng;
				x++;
			}
			d = c - num1;
		}
		System.out.println(d);

		for(y=0; y< b; y++) {
			//int sum = sc.nextInt();
			String str = sc.next();
			int cheng = Integer.parseInt(str);
			if(d >= cheng ) {

				num2 = num2 + cheng;
				w++;
			}

		}
		int ans = x+w;
		System.out.println(x);
		System.out.println(w);
		System.out.println(ans);
	}
}
