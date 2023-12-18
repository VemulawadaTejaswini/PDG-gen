import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long K = scan.nextLong();
        int P[]=new int[N];
        long C[]=new long[N];
        int kai[]=new int [N];
        long ten[]=new long[N];
        for(int i=0;i<N;i++){P[i]=scan.nextInt();}
        for(int i=0;i<N;i++){C[i]=scan.nextLong();}
        long m[]=new long[N];
        long le[]=new long[N];

        for(int i=0;i<N;i++){int j=P[i]-1;
            kai[i]=1;
            ten[i]=C[j];
            m[i]=C[j];
            le[i]=1;
            while(i!=j) {
                kai[i]++;
                j = P[j] - 1;
                ten[i] = ten[i] + C[j];
                if (m[i] < ten[i]) {
                    m[i] = ten[i];
                    le[i] = kai[i];
                }

            }

            }
long M[]=new long[N];
            for(int i=0;i<N;i++){
                if(ten[i]>0){
                M[i]=ten[i]*(long)((K-le[i])/kai[i])+m[i];}
                else if (K>le[i]){M[i]=m[i];}
                else{int y=i;
                long ten2[]=new long [N];                    for(int j=0;j<K;j++){
                        y = P[y] - 1;
                         ten2[i]= ten2[i] + C[y];
                        if (M[i] < ten2[i]) {
                            M[i] = ten2[i];
                        }
                }}
            }



        Arrays.sort(M);



System.out.println(M[N-1]);
    }
}
