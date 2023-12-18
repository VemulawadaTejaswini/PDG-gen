import java.util.Scanner;

class Main {

    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	String str = stdin.next();
	StringBuffer sb = new StringBuffer();
	for(int i = 0; i < str.length(); i++){
	    sb.append(str.charAt(str.length() - 1 - i));
	}
	System.out.println(sb.toString());
    }
}