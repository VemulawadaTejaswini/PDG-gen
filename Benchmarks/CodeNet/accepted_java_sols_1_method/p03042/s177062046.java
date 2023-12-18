import java.util.Scanner;

public class Main {

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);
        int s = Integer.parseInt(in.nextLine());
        int big = s/100;
        int small = s%100;

        boolean bigIsMM = big != 0 && big <= 12;
        boolean smallIsMM = small != 0 && small <= 12;

        if( bigIsMM && smallIsMM ){
            System.out.println("AMBIGUOUS");
        }
        else if( bigIsMM && !smallIsMM){
            System.out.println("MMYY");
        }
        else if( !bigIsMM && smallIsMM ){
            System.out.println("YYMM");
        }
        else {
            System.out.println("NA");
        }
    }
}