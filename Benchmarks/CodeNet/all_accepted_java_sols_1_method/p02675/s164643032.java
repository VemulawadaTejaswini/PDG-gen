import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] hon = {
            "pon", //0
            "pon", //1
            "hon", //2
            "bon", //3
            "hon", //4
            "hon", //5
            "pon", //6
            "hon", //7
            "pon", //8        
            "hon" //9        
        };
        int N = sc.nextInt();

        System.out.println(hon[N%10]);
    }
}