import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String N = scan.nextLine();
        scan.close();
        int len = N.length();
        int sum = 0;
        for(int i=0;i<len;i++){
            char digitChar = N.charAt(i);
            int digitInt = Character.getNumericValue(digitChar);
            sum = sum + digitInt;
        }
        if (sum%9==0){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
        return;
    }
}
