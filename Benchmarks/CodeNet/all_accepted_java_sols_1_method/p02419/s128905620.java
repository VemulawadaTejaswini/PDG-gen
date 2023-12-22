import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String W = scan.next();
        int count = 0;
        while(scan.hasNext()) {
            String str = scan.next();
            if(str.equals("END_OF_TEXT")){
            	break;
            }
            if(str.equalsIgnoreCase(W)){
            	count++;
            }
        }
        System.out.println(count);
    }
}