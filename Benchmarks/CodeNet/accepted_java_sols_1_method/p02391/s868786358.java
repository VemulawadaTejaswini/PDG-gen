import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        if(x == y){
            System.out.println("a == b");
        }else if(x > y){
            System.out.println("a > b");
        }else
            System.out.println("a < b");
    }
}