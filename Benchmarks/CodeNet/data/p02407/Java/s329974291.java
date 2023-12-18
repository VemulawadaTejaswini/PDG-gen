import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        int i, j;
        int[] num;
        num = new int[46];
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        for(i=0;i<length;i++){
            num[i] = sc.nextInt();
        }
        for(j=length-1;j>=0;j--){
            System.out.printf("%d ", num[j]);
        }
        System.out.println();
        sc.close();
    }
}
