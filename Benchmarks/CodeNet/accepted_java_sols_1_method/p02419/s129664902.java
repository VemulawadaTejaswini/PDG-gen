import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        int count = 0;
        while(true){
        	String t = sc.next();
            if(t.equals("END_OF_TEXT")){
            	break;
            }
            if(t.equalsIgnoreCase(w)){
            	count++;
            }
        }
        System.out.println(count);
    }
}
