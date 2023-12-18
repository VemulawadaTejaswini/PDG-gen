import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> strList = new ArrayList<String>();
	static ArrayList<String> strList2 = new ArrayList<String>();
	static ArrayList<Integer> intList = new ArrayList<Integer>();
	static HashMap<String,Integer> Hmap = new HashMap<String,Integer>();
	public static void main(String[] args) {


		int ans=0;
		String str = sc.nextLine();
		String[] strArrya=str.split(" ");

		int num=sc.nextInt();

		int a = Integer.parseInt(strArrya[0]);
		int b = Integer.parseInt(strArrya[1]);
		int c = Integer.parseInt(strArrya[2]);


		switch (num){
		  case 1:
		    ans = a*2;
		    if(ans >=b && ans >=c) {
				System.out.println("Yes");
		    }
		    else {
				System.out.println("No");
		    }
		    break;
		  case 2:
			ans = b*2;
			if(ans >=a && ans >=c) {
				System.out.println("Yes");
		    }
		    else {
				System.out.println("No");
		    }
		    break;
		  case 3:
			ans = c*2;
			if(ans >=a && ans >=b) {
				System.out.println("Yes");
		    }
		    else {
				System.out.println("No");
		    }
		    break;
		}
	}
}
