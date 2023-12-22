import java.util.Scanner;
 
class Main{
    	public static void main(String[] args){
        	Scanner sc = new Scanner(System.in);
        	String str = sc.nextLine().toLowerCase();
        	int x = 0;
        	while (sc.hasNextLine()) {
            		String str2 = sc.nextLine();
            		if ("END_OF_TEXT".equals(str2)) {
                		break;
            		}
            		String[] str3 = str2.split(" ");
            		for (int i = 0, l = str3.length; i < l; i++) {
                		String s = str3[i];
                		if (s.toLowerCase().equals(str)) {
                    			x++;
                		}
            		}
        	}
        	System.out.println(x);
    	}
}