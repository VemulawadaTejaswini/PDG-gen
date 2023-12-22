import java.util.Scanner;
import java.lang.Math;
import java.lang.StringBuilder;
import java.util.regex.Pattern;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            int D = sc.nextInt();
            switch(25%D){
                case 0:
                    System.out.println("Christmas");
                    break;
                case 1:
                    System.out.println("Christmas Eve");
                    break;
                case 2:
                    System.out.println("Christmas Eve Eve");
                    break;
                case 3:
                    System.out.println("Christmas Eve Eve Eve");
                    break;
            }
        }
    }
