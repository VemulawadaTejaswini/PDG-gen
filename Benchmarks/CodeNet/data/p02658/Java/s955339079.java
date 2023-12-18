import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int N= scan.nextInt();
       long A[]=new long[N];
       long s=1;
int K=1;
int OOO=1;
       for(int i=0;i<N;i++){A[i]= scan.nextLong();
           if(A[i]==0){s=0;}
           String NN=String.valueOf(A[i]);
           int KK=NN.length()-1;
           OOO=OOO+KK;
       }
       if (OOO>19){s=-1;}
        for(int i=0;i<N&&s>0&&K<19;i++){
            s=s*A[i];
            String m=String.valueOf(s-1);
            K=m.length();
        }

if (s<0||K>=19){s=-1;}
System.out.println(s);

    }
}


