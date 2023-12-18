import java.util.Arrays;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int N= scan.nextInt();
        long A[]=new long[N+1];
        long MAX=0;
    for(int i=0;i<=N;i++){A[i]=scan.nextLong();
    MAX=MAX+A[i];}
    long NE=1;
    long P=0;
if(MAX==0){NE=-1;}
    for(int i2=0;i2<=N;i2++){P=P+NE;
   NE=NE-A[i2];
MAX=MAX-A[i2];
        NE=NE*2;
        if(NE>MAX){NE=MAX;}
        
    }
    if(NE<0){P=-1;}
    if(A[N+1]==0){P=-1;}
    System.out.println(P);
    }
}

