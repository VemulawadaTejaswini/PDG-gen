

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        String s = "7";
        
        if(k % 2 == 0)
        	System.out.println(-1);
        else {
        	long count = 1;
        	while(true) {
        		if(Long.parseLong(s) % k == 0) {
        			System.out.println(count);
        			break;
        		}else {
        			s += "7";
        			++count;
        		}
        	}
        }

	}

}
