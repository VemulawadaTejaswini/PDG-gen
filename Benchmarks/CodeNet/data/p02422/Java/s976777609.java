import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a, b, i, j, n;
		int box;
		String str = sc.nextLine();
		n = Integer.parseInt(sc.nextLine());
        for(i = 0; i < n; i++){
    		String[] s = sc.next().split("");
        	a = Integer.parseInt(s[1]);
        	b = Integer.parseInt(s[2]);
        	switch(s[0]){
	            case "print":
	            	System.out.println(str.substring( a, b + 1));
	            	break;
	            case "reverse":
	            	box = ( b - a) / 2;
	            	char[] c = str.toCharArray();
	            	for(j = 0; j <= box; j++) {
	            		char tmp = str.charAt(a + j);
	            		c[ a + j] = c[b - j];
	            		c[b-j] = tmp;
	            	}
	            	str = String.valueOf(c);
	            	break;
	            case "replace":
	                StringBuilder sb = new StringBuilder(str);
	            	sb.replace(a, b + 1, s[3]);
	            	str = sb.toString();
	            	break;
        	}
        }
        sc.close();
    }
}
