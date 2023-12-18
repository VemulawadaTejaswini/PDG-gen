import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        for(int i=N; i<=999; i++){
            if(i == 111 || i == 222 || i == 333 || i == 444 || i == 555 || i == 666 || i == 777 || i == 888 || i == 999 ){
                result = i;
                break;
            }
        }
        System.out.print(result);
    }
}