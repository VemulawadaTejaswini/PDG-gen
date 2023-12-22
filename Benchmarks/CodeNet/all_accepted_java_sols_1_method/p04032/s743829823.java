import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        for(int i=0; i<str.length() - 2; i++){

            if(str.charAt(i) == str.charAt(i+1)){
                 System.out.println((i+1) + " "+ (i+2));
                 return;
            }

            if(str.charAt(i) == str.charAt(i+2)){
                System.out.println((i+1) + " "+ (i+3));
                return;
            }

        }

        if(str.charAt(str.length() -  2) == str.charAt(str.length() - 1)){
            System.out.println((str.length() -  1) + " "+ str.length());
        }else{
            System.out.println(-1+ " "+ -1);
        }
    }
}