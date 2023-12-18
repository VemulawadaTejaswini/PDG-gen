import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int menseki=a*b;
        int syu=2*a+2*b;
        System.out.println(menseki+" "+syu);
        scanner.close();
    }
}
