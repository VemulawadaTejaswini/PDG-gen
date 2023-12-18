import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        int rangeL = Math.min(b,a+k-1);
        int rangeR = Math.max(b-k+1,a+k);

        for(int i = a;i <= rangeL;i++)
            System.out.println(i);

        for(int i = rangeR;i <= b;i++)
            System.out.println(i);
        
    }
}