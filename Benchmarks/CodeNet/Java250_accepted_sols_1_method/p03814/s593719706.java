import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int id1 = 0;
		int id2 = 0;
		int hantei = 0;
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i) =='A' && hantei ==0) {
				hantei = 1;
				id1 =i;
			}
			if(s.charAt(i)=='Z' && hantei == 1) {
				id2 =i;
			}
		}
		System.out.println(id2-id1+1);
		
	}

}

