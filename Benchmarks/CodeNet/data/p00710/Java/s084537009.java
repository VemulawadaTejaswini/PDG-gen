import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int r = sc.nextInt();
            if(n==0 && r==0){
                break;
            }

            int[] yama = new int[n];
            for(int i=0;i<n;i++){
                yama[i] = n-i;
            }

            for(int i=0;i<r;i++){
                int p = sc.nextInt();
                int c = sc.nextInt();
                int[] new_yama = new int[n];
                for(int j=0;j<c;j++){
                    new_yama[j] = yama[p-1+j]; 
                }

                for(int j=c;j<c+p-1;j++){
                    new_yama[j] = yama[j-c]; 
                }

                for(int j=p-1+c;j<n;j++){
                    new_yama[j] = yama[j];
                }
                yama = new_yama;
            }
            System.out.println(yama[0]);
        }
    }
}
