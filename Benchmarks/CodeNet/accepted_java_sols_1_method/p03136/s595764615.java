import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[]L = new int[N];
 
    int all = 0;
    for(int i=0; i<N; i++){
        L[i] = sc.nextInt();
        all += L[i];
    }
        Arrays.sort(L);
        if(L[N-1]<all-L[N-1]) {
        System.out.println("Yes");
        }else {
        System.out.println("No");
    }
    }
}