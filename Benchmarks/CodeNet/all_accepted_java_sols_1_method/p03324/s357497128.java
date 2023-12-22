import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();

        int i = 0;
        int num = 0;
        while(true) {
            do {
              num ++;
            } while(num % 100 == 0);
            i++;
            if(n == i) {
                break;
            }
        }
        for(;d>0;d--) {
            num *= 100;
        }
        System.out.println(num);
    }

}
