import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        double sum = 0;
        double tmp;
        for(int i=0;i<n;i++){
            tmp = 1.0/Integer.parseInt(sc.next());
            sum+=tmp;
        }
        System.out.println(1.0/sum);
        sc.close();
    }
}