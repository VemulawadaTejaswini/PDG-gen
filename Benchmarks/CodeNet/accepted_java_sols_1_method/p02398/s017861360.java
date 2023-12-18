import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int a,b,c;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        int count = 0;
        for(int i = a; i <= b; i++){
            if(c % i == 0){
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}

