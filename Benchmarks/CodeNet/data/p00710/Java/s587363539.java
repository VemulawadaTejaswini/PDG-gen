import java.util.Scanner;

public class Main{
    public static void main(String[]argc){
        Scanner sc = new Scanner(System.in);
        int[] num1 = new int[100];
        int[] num2 = new int[100];
        while(true){
            int n = sc.nextInt();
            int r = sc.nextInt();
            if(n==0&&r==0) break;
            for(int i=0;i<n;i++){
                num1[i] = n-i;
            }
            for(int x=0;x<r;x++){
                int p = sc.nextInt();
                int c = sc.nextInt();
                for(int j=0;j<p-1;j++){
                    num2[j] = num1[j];
                }
                for(int k=0;k<c;k++){
                    num1[k] = num1[k+p-1];
                }
                for(int m=c;m<c+p-1;m++){
                    num1[m] = num2[m-c];
                }
            }
            System.out.println(num1[0]);    
        }
    }
}
