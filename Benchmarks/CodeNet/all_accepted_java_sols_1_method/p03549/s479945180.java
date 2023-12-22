import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        double parcent=M;
        parcent =Math.pow(2, parcent);
        int i=(int)parcent;
        System.out.println(((N-M)*100+M*1900)*i);
    }
}