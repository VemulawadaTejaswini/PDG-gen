import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt(),D=sc.nextInt();
        System.out.println((C-1)/B<=(A-1)/D?"Yes":"No");
    }
}