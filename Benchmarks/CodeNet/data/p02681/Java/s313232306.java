import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();

        String reg = "^" + a + "[a-z]$";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(b);

        if(m.find()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        scan.close();
    }
}