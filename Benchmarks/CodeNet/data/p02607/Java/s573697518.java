import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> strList = new ArrayList<String>();
	static ArrayList<String> strList2 = new ArrayList<String>();
	static ArrayList<Integer> intList = new ArrayList<Integer>();
	static HashMap<String,Integer> Hmap = new HashMap<String,Integer>();
	public static void main(String[] args) {


		int a = sc.nextInt();
		int ans=0;

		for(int i=1;i<=a;i++) {
			int b = sc.nextInt();
			intList.add(b);
		}

		int i =1;
		for(int disp : intList) {
			if(i%2 != 0 && disp%2 != 0) {
				ans++;
			}
			i++;
		}
		System.out.println(ans);
	}
}
