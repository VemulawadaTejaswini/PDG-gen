import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			if (p + q == 0) {
				break;
			}
			ArrayList<ArrayList<Integer>> equation = new ArrayList<ArrayList<Integer>>();
			ArrayList<ArrayList<Integer>> solve = new ArrayList<ArrayList<Integer>>();
			int br = 0;
			int bc = 0;
			int bs = 0;
			for(int i=0;i<p;i++) {
				String s = sc.next();
				int j = 0;
				int dots = 0;
				for(j=0;j<s.length();j++) {
					char c = s.charAt(j);
					if (c == '.') {
						dots++;
					}else{
						break;
					}
				}
				if (true) {
					ArrayList<Integer> al = new ArrayList<Integer>();
					al.add(br);
					al.add(bc);
					al.add(bs);
					al.add(dots);
					equation.add(al);
				}
				for(;j<s.length();j++) {
					char c = s.charAt(j);
					switch (c) {
					case '(':
						br++;
						break;
					case ')':
						br--;
						break;
					case '{':
						bc++;
						break;
					case '}':
						bc--;
						break;
					case '[':
						bs++;
						break;
					case ']':
						bs--;
						break;
					}
				}
			}
			for(ArrayList<Integer> al:equation) {
				//System.out.println(al);
			}
			for(br=1;br<=20;br++) {
				for(bc=1;bc<=20;bc++) {
					for(bs=1;bs<=20;bs++) {
						boolean flag = true;
						for(ArrayList<Integer> al:equation) {
							if (br * al.get(0) + bc * al.get(1) + bs * al.get(2) != al.get(3)) {
								flag = false;
								break;
							}
						}
						if (flag) {
							ArrayList<Integer> al = new ArrayList<Integer>();
							al.add(br);
							al.add(bc);
							al.add(bs);
							solve.add(al);
							//System.out.println(br + "," + bc + "," + bs);
						}
					}
				}
			}
			br = 0;
			bc = 0;
			bs = 0;
			for(int i=0;i<q;i++) {
				int dots = -1;
				for(ArrayList<Integer> sol:solve) {
					int d = br * sol.get(0) + bc * sol.get(1) + bs * sol.get(2);
					if (dots == -1) {
						dots = d;
					}else{
						if (dots != d) {
							dots = -2;
						}
					}
				}
				if (dots < 0) {
					dots = -1;
				}
				if (i != q-1) {
					System.out.print(dots + " ");
				}else{
					System.out.println(dots);
				}
				String s = sc.next();
				for(int j=0;j<s.length();j++) {
					char c = s.charAt(j);
					switch (c) {
					case '(':
						br++;
						break;
					case ')':
						br--;
						break;
					case '{':
						bc++;
						break;
					case '}':
						bc--;
						break;
					case '[':
						bs++;
						break;
					case ']':
						bs--;
						break;
					}
				}
			}
		}
	}
}