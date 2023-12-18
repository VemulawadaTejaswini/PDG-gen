import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    static int[] prime = new int[200000];
    static ArrayList<Integer> ans =new ArrayList<Integer>();

    public static void main(String[] args) {
        calcPrime();
        while (true) {
            int N=s.nextInt();
            int P = s.nextInt();
            if(N==-1) break;

            ans.clear();
            int count=0;
            int[] prime2 =new int[P];
            for (int i=N+1;count<P;i++){
                if(prime[i] ==0)continue;
                prime2[count]=i;
                count++;
            }

            for (int i=0;i<P;i++){
                for(int j=i;j<P;j++){
                    ans.add(prime2[i] + prime2[j]);
                }
            }
            ans.sort(Comparator.<Integer>naturalOrder());
            System.out.println(ans.get(P-1));
        }
    }
    static void calcPrime(){
        for(int i=0;i<200000;i++)
            prime[i]=i;
        prime[1]=0;

        for(int i=2;i<200000;i++){
            for (int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    prime[i]=0;
                    break;
                }
            }
        }
    }
}