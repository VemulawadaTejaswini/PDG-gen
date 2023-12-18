import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 3; i < x+1; i++){
            if (i / 3 == 0) {
                System.out.print(" " + i);
            } else if (i % 3 == 0) {
                System.out.print(" " + i);
            }
        }
        System.out.print("\n");
    }
}

