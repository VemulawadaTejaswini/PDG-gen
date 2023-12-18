import java.util.*;
//import java.util.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int A[] = new int[n];
    int i,j;
    
    for(i = 0; i < n; i++){
        A[i] = sc.nextInt();
       // System.out.println(A[i]);
    }
    
    int min = A[0];
    int maxv = A[1] - A[0];
    
    for(i = 1; i < n; i++){
        if((A[i] - min) > maxv){
            maxv = (A[i] - min);
        }
        if(A[i] < min){
            min = A[i];
        }
    }
    
    System.out.println(maxv);

    }
}

