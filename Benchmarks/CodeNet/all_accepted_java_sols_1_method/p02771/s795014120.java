import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] ints = new int[10];

        ints[a]++;
        ints[b]++;
        ints[c]++;

        for(int i=0;i<10;i++){
            if(ints[i] == 2){
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");

    }
}
