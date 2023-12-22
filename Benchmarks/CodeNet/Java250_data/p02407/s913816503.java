import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        int i, j;
        int[] num;
        num = new int[100];
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        for(i=0;i<length;i++){
            num[i] = sc.nextInt();
        }
        for(j=length-1;j>=0;j--){
            if(j==0){
                System.out.printf("%d\n", num[j]);
            }else{
                System.out.printf("%d ", num[j]);
            }
        }
        sc.close();
    }
}
