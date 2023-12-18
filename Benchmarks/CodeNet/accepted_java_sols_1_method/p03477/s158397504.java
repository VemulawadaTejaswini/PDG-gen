import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() + sc.nextInt();
        int c = sc.nextInt() + sc.nextInt();
        if(a == c) {
            System.out.println("Balanced");
        } else if(a > c){
            System.out.println("Left");
        } else {
            System.out.println("Right");
        }
    }
}