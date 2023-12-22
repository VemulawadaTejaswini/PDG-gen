import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A[] = new int[110];
        int N = sc.nextInt();
        int D = sc.nextInt();     //日数
        int X = sc.nextInt();     //残ったチョコ

        int count = 0;
        int i = 0;

        for(i = 0;i<N;i++){
            A[i] = sc.nextInt();
            
            for(int j = 1;j<=D;j=j+A[i]){
                count++;
            }
        }

        System.out.println((X+count));

    
    
    }



}