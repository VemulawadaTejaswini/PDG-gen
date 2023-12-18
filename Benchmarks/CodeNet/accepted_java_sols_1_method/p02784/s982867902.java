import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int N = sc.nextInt();
        int A = 0;

        for(int i=0; i<N; i++){
            A += sc.nextInt();
        }
        if(A>=H){
            System.out.println("Yes");
        }
        else if(A<H){
            System.out.println("No");
        }
    }
}