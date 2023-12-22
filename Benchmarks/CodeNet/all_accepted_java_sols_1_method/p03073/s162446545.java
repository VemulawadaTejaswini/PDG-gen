import java.util.Scanner;

import java.util.*;
import static java.util.Comparator.*;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		String s  = scan.next();

		int ret = 0;
		char c = s.charAt(0);
		for (int i = 1; i < s.length() ; i++){
			if(c == s.charAt(i)){
				ret++;
				c=(s.charAt(i) == '0')? '1':'0';
			}else{
				c = s.charAt(i);
			}
		}

		System.out.println(ret);

	}

}
