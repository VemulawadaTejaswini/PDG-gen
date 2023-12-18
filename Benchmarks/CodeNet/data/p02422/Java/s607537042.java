import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
		String s = stdIn.next();
		int q = stdIn.nextInt();

		for (int i=0; i<q; i++) {
			String com = stdIn.next();
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();

			if(com.equals("reverse")){
				String rev = s.substring(a,b+1);
				String temp = s.substring(b+1);
				s = s.substring(0,a);
				for (int index=rev.length()-1; index>=0; index--) {
					s += rev.charAt(index);
				}
				s += temp;

			}else if(com.equals("replace")){
				String p = stdIn.next();
				s = s.substring(0,a) + p + s.substring(b+1);

			}else{
				String temp = s.substring(a,b+1);
				System.out.println(temp);
			}
		}
    }
}
