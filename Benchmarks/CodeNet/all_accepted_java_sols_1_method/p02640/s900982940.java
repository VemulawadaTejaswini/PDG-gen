import java.util.Scanner;

public class Main {
    static final String YES = "Yes";
    static final String NO = "No";
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();
        int Y = scan.nextInt();

        scan.close();

        if (Y%2 != 0){
            System.out.println(NO);
            return;
        }

        int crane = 2*X - Y/2;
        int turtle = (Y-2*X)/2;

        if (crane < 0 ){
            System.out.println(NO);
            return;
        }

        if( turtle < 0){
            System.out.println(NO);
            return;
        }

        System.out.println(YES);
        
    }
}
