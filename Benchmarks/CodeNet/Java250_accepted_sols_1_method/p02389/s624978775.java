import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int Longitudinal = scanner.nextInt();
        int side = scanner.nextInt();

        int area = Longitudinal * side;
        int length = (Longitudinal + side) * 2;
        
        System.out.println(area + " " + length);
    }
}