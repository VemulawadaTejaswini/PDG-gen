import java.util.*;
public class Main {
    public static void main(String[] args){
        int A, B, C, X;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        X = sc.nextInt();
        int count =0;
        for(int i=0;i<=A;i++){
            for(int j=0;j<=B;j++){
                for(int k=0;k<=C;k++){
                    if(500*i+100*j+50*k==X){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

}
