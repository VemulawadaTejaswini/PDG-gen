import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
		String s = scn.next();
      	int check = 0;
		if (s.charAt(0) != 'A') {
			check = 1;
		}
      	if (s.charAt(1) == 'C') {
			check = 1;
		}
		int count =0;
		for (int i=2;i<s.length()-1; ++i) {
			if (s.charAt(i)=='C') {
				count = count + 1;
			}
		}
		if (count != 1) {
			check = 1;
		}
		for (int i=1;i<s.length(); ++i) {
			if (s.charAt(i)!='C' && (s.charAt(i)<'a' || s.charAt(i)>'z')) {
				check = 1;
			}
		}
      if(check == 0){
		System.out.println("AC");
      }else{
        System.out.println("WA");
      }
	}
}
