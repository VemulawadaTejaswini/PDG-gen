import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(s.length()-1);
        if (c=='2'||c=='4'||c=='5'||c=='7'||c=='9')
             System.out.println("hon");
        else if(c=='0'||c=='1'||c=='6'||c=='8')
             System.out.println("pon");
        else System.out.println("bon");
    }
}
