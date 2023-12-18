import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] L = new int[N];
        int count = 0;
        for(int i = 0; i < N; i++){
            L[i] = scan.nextInt();
        }
        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                for(int k = j+1; k < N; k++){
                    if(L[i] != L[j] && L[j] != L[k] && L[k] != L[i]){
                        if((L[i]+L[j]>L[k]) && (L[j]+L[k]>L[i]) && (L[k]+L[i]>L[j])){
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}