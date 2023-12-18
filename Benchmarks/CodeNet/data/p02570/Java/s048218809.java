import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] val = new int[3];
        for(int i = 0; i < val.length; ++i) {
            val[i] = sc.nextInt();
        }

        if(val[0] <= val[1] * val[2]){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}