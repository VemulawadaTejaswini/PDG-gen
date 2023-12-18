import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	sc.close();
    	char[] s = str.toCharArray();
    	boolean flag = true, existC = false;
    	if(s.length < 4 || s.length > 10 || s[0] != 'A')
    		flag = false;
    	for(int i = 1; i < s.length && flag; ++i) {
    		if(s[i] <= 'z' && s[i] >= 'a')
    			continue;
    		else if(s[i] == 'C') {
    			if(!existC && i > 1 && i < s.length-1)
    				existC = true;
    			else
    				flag = false;
    		} else {
				flag = false;
			}
    	}
    	if(flag && existC)
    		System.out.println("AC");
    	else
    		System.out.println("WA");
    }
}