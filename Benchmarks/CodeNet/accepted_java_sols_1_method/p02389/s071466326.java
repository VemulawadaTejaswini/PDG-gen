import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int x = n1*n2;
        int y = (n1+n2)*2;
        System.out.print(x);
        System.out.println(" "+y);
    }
}
