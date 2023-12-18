import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        if(x < y && y < z){
            System.out.println("Yes");
        }else
            System.out.println("No");
    }
}