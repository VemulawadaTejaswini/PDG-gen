import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        a=input.nextInt();
        b=input.nextInt();

       if (a>b){
           System.out.println("a > b");
       }
       else if (a<b){
           System.out.println("a < b");
       }
       else
           System.out.println("a == b");

    }
}
