import java.util.*;

import javax.tools.ForwardingJavaFileObject;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Integer []A=new Integer[a];
        Integer []B=new Integer[b];
        Integer []C=new Integer[c];
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<B.length;i++){
            B[i]=sc.nextInt();
        }
        for(int i=0;i<C.length;i++){
            C[i]=sc.nextInt();
        }
        Arrays.sort(A,Collections.reverseOrder());
        Arrays.sort(B,Collections.reverseOrder());
        Arrays.sort(C,Collections.reverseOrder());
        
        Integer[]account=new Integer[X+Y+c];
        for(int i=0;i<X;i++){
            account[i]=A[i];
        }
        for(int i=0;i<Y;i++){
            account[X+i]=B[i];
        }
        for(int i=0;i<c;i++){
            account[X+Y+i]=C[i];
        }
        Arrays.sort(account,Collections.reverseOrder());
        long count=0;
        for(int i=0;i<X+Y;i++){
            count+=account[i];
        }
        System.out.println(count);
    }
}