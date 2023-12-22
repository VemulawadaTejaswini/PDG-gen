import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int answer = 0;
        while(a != b + 1) {
            double d = a;
            int check = c / a;
            double check2 = c / d;
            if(check == check2){
                answer++;
            }
            a++;
        }
        System.out.println(answer);
    }
}
