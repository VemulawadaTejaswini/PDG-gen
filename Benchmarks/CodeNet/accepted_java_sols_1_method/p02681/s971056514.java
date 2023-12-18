import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();

        if(str.length()+1 == str2.length() && str.equals(str2.substring(0,str.length()))){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
