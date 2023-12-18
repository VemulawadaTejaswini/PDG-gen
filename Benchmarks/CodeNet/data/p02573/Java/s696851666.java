import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
int A[]=new int[M];
        int B[]=new int[M];
int root[]=new int[N];


        for(int i=0;i<M;i++){
            A[i]=scan.nextInt()-1;
            B[i]=scan.nextInt()-1;
if(A[i]>B[i]){
    int KOU=A[i];
    A[i]=B[i];
    B[i]=KOU;
}
if(root[A[i]]==0){
    if(root[B[i]]==0){
        root[A[i]]=A[i]+1;
        root[B[i]]=A[i]+1;
    }
}
else{if(root[B[i]]==0||root[B[i]]>root[A[i]]){root[B[i]]=root[A[i]];}
else{root[A[i]]=root[B[i]];}
}
        }

        int p[]=new int [N];
        for(int j=0;j<N;j++){p[root[j]]++;}
        Arrays.sort(p);
        System.out.println(p[N-1]);
    }
}
