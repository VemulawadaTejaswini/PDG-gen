import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a0,l;
		boolean flag = true;
		ArrayList<Integer> al;
		while(true) {
			a0 = sc.nextInt();
			l = sc.nextInt();
			if(l==0) {break;}
			
			al = new ArrayList<>();
			flag = true;
			al.add(a0);
			do {
					al.add(calcNext(al.get(al.size()-1), l));
				for(int i=0; i<al.size()-1; i++) {
					if(al.get(i).equals(al.get(al.size()-1))) {
						System.out.println(i + " " + al.get(i) + " " + (al.size()-1-i));
						flag = false;
						break;
					}
				}
			}while(flag);
			
		}
		sc.close();
	}
	
	public static int calcNext(int n,int l) {
//		int length = (int)Math.log10(n-1) +1 ;
		String str = "" + n;
		while(str.length() != l) {
			str = "0" + str;
		}
		char[] c = str.toCharArray();

		Arrays.sort(c);
		
		n=0;
		for(int i=0;i<c.length;i++) {
			n-=Integer.parseInt(""+c[i]) * Math.pow(10, c.length - i - 1);
		}
		for(int j=0;j<c.length;j++) {
			n+=Integer.parseInt(""+c[j]) * Math.pow(10, j);
		}
		
		return n;
	}

}

