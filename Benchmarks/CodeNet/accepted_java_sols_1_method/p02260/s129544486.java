import java.util.Scanner;
//* alds1_2_B *//
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int input[] = new int[N];
        int minj,i,j,tmp,k;
        int count = 0;
        for (int x =0 ; x < N ; x++){
            input[x] = sc.nextInt();
        }
        for (i=0; i <N; i++){
            minj = i;
            for (j =i; j < N; j++){
                if(input[j] < input[minj]){
                    minj = j;
                }
            }
            if(i != minj) {
                tmp = input[minj];
                input[minj] = input[i];
                input[i] = tmp;
                count++;
            }
        }
        for(k=0; k<N-1;k++){
            System.out.print(input[k]+ " ");
        }
        if(k == N-1){
            System.out.println(input[k]);
        }
        System.out.println(count);
    }

}
