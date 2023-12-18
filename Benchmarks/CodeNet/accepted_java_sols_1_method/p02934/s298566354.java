import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        double beneath = 0;
        for (int i = 0;i<N;i++){
            beneath = beneath + 1.0/sc.nextInt();
        }
        System.out.println(1.0/beneath);

    }
}
