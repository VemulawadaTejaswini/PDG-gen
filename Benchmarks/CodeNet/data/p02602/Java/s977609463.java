import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] score = new int[N];
        for(int i=0;i<N;i++){
            score[i] = sc.nextInt();
        }
        sc.close();

        int beforeScore = 1;
        int afterScore = 1;
        int o = 0;
        
        for(int i=0; i<N-K; i++){
            for(int j=0; j<K; j++){
                o = j+i;
                beforeScore = beforeScore*score[o];
                afterScore = afterScore*score[o+1];
            }
            if(beforeScore >= afterScore){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
            beforeScore = 1;
            afterScore = 1;
        }
    }
}
