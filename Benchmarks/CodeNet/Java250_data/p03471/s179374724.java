import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int bill = sc.nextInt();
        int otoshidama = sc.nextInt();
        int x = -1;
        int y = -1;
        int z = - 1;
        check :for(int k = 0; k <= bill; k++) {
            for(int i = 0; i <= bill - k; i++) {
                int j =  bill - (k +i);
                int sum = 10000 * k + 5000 * i + 1000 * j;
                if(sum ==otoshidama && (k + i + j) == bill) {
                    x = k; y = i; z = j;
                    break check;
                }
            }
        }
        System.out.println(x +" "+y+" "+z);
    }
}
