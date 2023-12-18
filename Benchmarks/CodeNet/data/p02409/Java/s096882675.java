import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[][][];
        A=new int[4][3][10];
        for(int i=0;i<N;i++){
            int a[];
            a=new int[4];
            for(int j=0;j<4;j++) a[j]=sc.nextInt();
            A[a[0]-1][a[1]-1][a[2]-1]+=a[3];
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                System.out.print(" ");
                for(int k=0;k<10;k++){
                    System.out.print(A[i][j][k]);
                    if(k!=9) System.out.print(" ");
                    else System.out.println();
                }
            }
            if(i!=3) System.out.println("####################");
        }
    }
}
