import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        double round;
        round = 2 * r * Math.PI;
        System.out.println(round);
    }
}