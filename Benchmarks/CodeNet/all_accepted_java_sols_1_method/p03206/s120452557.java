import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        System.out.print("Christmas");
        while(25-D > 0) {
            System.out.print(" Eve");
            D++;
        }
        System.out.print("\n");
    }
}