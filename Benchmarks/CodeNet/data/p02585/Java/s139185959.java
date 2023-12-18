import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long K = scan.nextLong();
    int P[]=new int[N];
        long C[]=new long[N];
        int kai[]=new int [N];
        long ten[]=new long[N];
        for(int i=0;i<N;i++){P[i]=scan.nextInt();}
        for(int i=0;i<N;i++){C[i]=scan.nextLong();}
for(int i=0;i<N;i++){int j=P[i]-1;
    kai[i]=1;
    ten[i]=C[j];
    while(i!=j){
        kai[i]++;
        j=P[j]-1;
        ten[i]=ten[i]+C[j];
    }

}
long M[]=new long[N];
for(int i=0;i<N;i++){M[i]=C[P[i]-1];
    if(ten[i]<=0) {
        long o = 0;
        int k = i;

        for(int j=0;j<kai[i];j++) {
            k = P[k] - 1;
            o = o + C[k];
            if (o > M[i]) {
                M[i] = o;
            }
        }
    }
else {long oi=0;
int y=i;
for(int k=0;k<K%kai[i];k++){

    y=P[y]-1;
    oi=oi+C[y];
    if(oi>M[i]){M[i]=oi;}}
M[i]=M[i]+ten[i]*(long)(K/kai[i]);
}
}
        Arrays.sort(M);

System.out.println(M[N-1]);
}
    }



