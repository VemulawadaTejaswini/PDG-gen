import java.util.Scanner;
class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        StringBuffer str = new StringBuffer(S);
        String S2 = str.reverse().toString();
        int i = 0;
        if ((S.length()%2) == 0) {
        		for (int j=0; j<(S.length()/2); j++) {
        			if (S.charAt(j)!=S2.charAt(j)) {
        				i ++;
        			}
        		}
        } else {
	        	for (int j=0; j<((S.length()-1)/2); j++) {
	    			if (S.charAt(j)!=S2.charAt(j)) {
	    				i ++;
	    			}
	        	}
        }
        System.out.println(i);
    }
} 