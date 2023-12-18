

import java.util.Scanner;
import java.util.TreeSet;

public class Main{
	 TreeSet<String> set;

	void Add(String a, String b){

		String s = ""+ a + b;
		set.add(s);
	}


	void run(){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for(int i = 0; i<n; i++){
			String s = sc.next();
			set = new TreeSet<String>();

			for(int j=1; j<s.length(); j++){
				String a = s.substring(0, j);
				String aRev = new StringBuilder(a).reverse().toString();

				String b = s.substring(j, s.length());
				String bRev = new StringBuilder(b).reverse().toString();

				Add(a,b);
				Add(a,bRev);
				Add(b,a);
				Add(b,aRev);
				Add(aRev,b);
				Add(bRev,a);
				Add(aRev,bRev);
				Add(bRev,aRev);

			}

			System.out.println(set.size());
		}


	}

	public static void main(String[] args) {
			new Main().run();

	}

}