import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] A = new int[50];
        int[] B = new int[50];
        int[] C = new int[50];
        int i = 0;
        
        while(true){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
            if(A[i] == -1 && B[i] == -1 && C[i] == -1) break;
            i++;
        }
        for(int j = 0; j < i; j++){
            if(A[j] == -1 || B[j] == -1) System.out.println("F");
            else if(A[j] + B[j] >= 80) System.out.println("A");
            else if(A[j] + B[j] < 80 && A[j] + B[j] >=65) System.out.println("B");
            else if((A[j] + B[j] < 65 && A[j] + B[j] >=50) || (A[j] + B[j] < 50 && A[j] + B[j] >=30 && C[j] >=50)) System.out.println("C");
            else if(A[j] + B[j] < 50 && A[j] + B[j] >=30 && C[j] < 50) System.out.println("D");
            else if(A[j] + B[j] < 30) System.out.println("F");
        }
    }
}
