import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = 0;
        for(int i=a;i<=b;i++){
            if(c%i ==0){
                d++;}
        }
        System.out.println(d);
            }
        }