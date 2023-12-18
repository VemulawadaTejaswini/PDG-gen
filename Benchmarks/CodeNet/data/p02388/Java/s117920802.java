import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int x = stdIn.nextInt();
        int cube = x*x*x;

        System.out.println(cube);
    }
}