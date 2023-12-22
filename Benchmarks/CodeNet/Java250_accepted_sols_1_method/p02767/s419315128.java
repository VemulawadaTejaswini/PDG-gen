import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt(),sum,min=Integer.MAX_VALUE;
        int A[]=new int[a];
        for(int i=0;i<a;i++)
            A[i]=in.nextInt();
        for(int j=0;j<101;j++) {
            sum=0;
            for (int i = 0; i < a; i++) {
                sum +=(A[i]-j)*(A[i]-j);
            }
            min=Math.min(sum,min);
        }
        System.out.println(min);

    }
}
