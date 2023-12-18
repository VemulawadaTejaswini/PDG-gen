import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String result = "";
        
        switch(N%10) {
            case 2:
            case 4:
            case 5:
            case 7:
            case 9:
                result = "hon";
                break;

            case 0:
            case 1:
            case 6:
            case 8:
                result = "pon";
                break;

            case 3:
                result = "bon";
                break;
                
        }

        System.out.println(result);
    }
}