import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int index = 0;
		int count = 0;
		while(true) {
		    index = s.indexOf("o", index) + 1;
		    if (index == 0) break;
		    count++;
		}
        System.out.println(700+count*100);
     }
}	