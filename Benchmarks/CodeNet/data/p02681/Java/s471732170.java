import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        line2 = line2.substring(0,line2.length()-1);
        if(line1.equals(line2)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
