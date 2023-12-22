import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;

public class Main {
    public Main(){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        int[] B=new int[N];
        int[] C=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            B[i]=sc.nextInt();
            C[i]=A[i]-B[i];
        }
        Arrays.sort(C);
        long need=0;
        int result=0;
        for(int i=0;i<N;i++){
            if(C[i]<0){
                need-=C[i];
                result++;
            }else{
                break;
            }
        }
        for(int i=0;i<N;i++){
            if(need>0){
                if(C[N-1-i]>0){
                    need-=C[N-1-i];
                    result++;
                }else{
                    System.out.println(-1);
                    return;

                }
            }else{
                break;
            }
        }
        System.out.println(result);
        return;

    }
    public static void main(String[] args){
        Main main=new Main();
    }

}
