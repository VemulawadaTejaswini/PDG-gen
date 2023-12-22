import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A;
        A = new int[n];
        int Sum, check = 0;
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] m;
        m = new int[q];
        for(int i = 0; i < q; i++){
            m[i] = sc.nextInt();
        }
        int[] flag;
        flag = new int[n];
        for(int i = 0; i < q; i++){
            for(int j = 0; j < n; j++){
                flag[j] = 0;
            }
            while(true){
                check = 0;
                flag[0]++;
                for(int k = 1; k < n; k++){
                    if(flag[k-1] == 2){
                        flag[k]++;
                        flag[k-1] = 0;
                    }
                }
                if(flag[n-1] == 2){
                    break;
                }
                Sum = 0;
                for(int k = 0; k < n; k++){
                    if(flag[k] == 1){
                        Sum += A[k];
                    }
                }
                if(Sum == m[i]){
                    System.out.println("yes");
                    check = 1;
                    break;
                }
            }
            if(check == 0){
                System.out.println("no");       
            }
        }
    }
}
