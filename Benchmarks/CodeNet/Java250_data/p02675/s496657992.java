import java.util.Scanner;
import java.util.StringTokenizer;

 class Main {

    public static void main(String[] args) {

        Scanner fastReader = new Scanner(System.in);
        find( fastReader.nextInt() );

    }

    public static void find( int num ){

        int lastDigit = num % 10;

        if( lastDigit == 2 || lastDigit == 4 || lastDigit == 5 || lastDigit == 7 || lastDigit == 9 ){
            System.out.println("hon");
        }
        else if( lastDigit == 0 || lastDigit == 1 || lastDigit == 6 || lastDigit == 8 ){
            System.out.println("pon");
        }else{
            System.out.println("bon");
        }
    }
}

