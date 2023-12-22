import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		boolean jdg =true;
		for(int i =  c.length()-1;i >=2;i-=1) {
			if(i%2==1)continue;
			for(int k = 0;k < i/2;k++) {
				if(c.charAt(k) != c.charAt(k+(i/2))) {
					jdg = false;
					break;
				}
			}
			if(jdg == true) {
				System.out.println(i);
				break;
			}
			jdg = true;
		}
	}

}
