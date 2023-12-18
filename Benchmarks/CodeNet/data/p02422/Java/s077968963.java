import java.util.*;
 
class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	String plain = sc.nextLine();
    	int q = sc.nextInt();
    	int argA, argB;
    	String argC;
    	String tmp = "";
    	ArrayList<String> prtList = new ArrayList<>();
    	int cnt = 0;
    	for(int i = 0; i < q; i++) {
    		String cmd = sc.next();
    		if(cmd.equals("print")) {
    			argA = sc.nextInt();
    			argB = sc.nextInt();
    			plain = plain.substring(argA, argB + 1);
    			prtList.add(plain);
    			cnt++;
    		} else if(cmd.equals("reverse")) {
    			argA = sc.nextInt();
    			argB = sc.nextInt();
    			tmp = plain.substring(argA, argB + 1);
    			StringBuffer sb = new StringBuffer(tmp);
    			tmp = sb.reverse().toString();
    			plain = plain.substring(0, argA) + tmp + plain.substring(argB + 1);
    		} else if(cmd.equals("replace")) {
    			argA = sc.nextInt();
    			argB = sc.nextInt();
    			argC = sc.next();
    			plain = plain.substring(0, argA) + argC + plain.substring(argB + 1);
    		}
    	}
    	for(int i = 0; i < cnt; i++) {
    		System.out.println(prtList.get(i));
    	}
    }
}