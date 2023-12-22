import java.util.Scanner;

/**
 * Created by DELL on 2017/7/1.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.next();
        for (int i = 1; i <a.length() ; i++) {
            if (a.substring(0,a.length()/2-i).equals(a.substring(a.length()/2-i,a.length()-2*i))) {
                System.out.println(a.length()-2*i);
                break;
            }
        }
    }

}