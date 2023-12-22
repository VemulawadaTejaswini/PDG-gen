import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for(int i = 0;i < n;i++){
            A[i] = sc.nextInt();
        }

        int flag = 1,count = 0,tmp;
        while(flag == 1){
            flag = 0;
            for(int i = n - 1;i > 0;i--){
                if(A[i - 1] > A[i]){
                    tmp = A[i - 1];
                    A[i - 1] = A[i];
                    A[i] = tmp;
                    count++;
                    flag = 1;
                }
            }
        }

        for(int i = 0;i < n;i++){
            if(i != 0)  System.out.print(" ");
            System.out.print(A[i]);
        }
        System.out.println();
        System.out.println(count);
    }
}
