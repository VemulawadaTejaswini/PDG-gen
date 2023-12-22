import java.util.*;
//import java.util.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int A[] = new int[n];
    int i;
    boolean flag = true;
    int tmp;
    int count = 0;
    
    for(i = 0; i < n; i++){
        A[i] = sc.nextInt();
    }
    
    while(flag){
        flag = false;
        for(i = n-1; i > 0; i--){
            if(A[i] < A[i-1]){
                tmp = A[i-1];
                A[i-1] = A[i];
                A[i] = tmp;
                flag = true;
                //System.out.println("test");
                count++;
            }
        }
    }
    
    for(i = 0; i < n; i++){
        System.out.print(A[i]);
        if(i < (n-1)){ System.out.print(" "); }
    }
    System.out.println();
    System.out.println(count);

    }
}

