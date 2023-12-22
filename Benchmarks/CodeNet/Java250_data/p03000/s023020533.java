import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.print("");
        int X = sc.nextInt();
        System.out.println("");

        int[] L = new int[N];
        int i;
        for(i = 0; i < N; i++){
            L[i] = sc.nextInt();
            System.out.print("");
        }
        i = 0;
        int c = 1;
        int sum = 0;

        while(sum <= X && N > 0){
            sum += L[i];
            if(sum <= X) c++;
            i++;
            N --;
        }
        System.out.println(c);
    }
}
