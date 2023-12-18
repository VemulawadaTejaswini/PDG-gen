import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n=sc.nextInt();
            if(n==0) {
                break;
            }
            Integer[] l=d(n);
            if(l[0]==l[1]&&l[1]==l[2]&&l[2]==l[3]) {
                System.out.println("NA");
                continue;
            }
            int c=0;
            while(n!=6174) {
                c++;
                l=d(n);
                Arrays.sort(l,Comparator.reverseOrder());
                int a=c(l);
                Arrays.sort(l);
                int b=c(l);
                n=a-b;
            }
            System.out.println(c);
        }
    }
    static int c(Integer[] l) {
        int n=0;
        for(int i=0,j=1000;i<4;i++,j/=10) {
            n+=l[i]*j;
        }
        return n;
    }
    static Integer[] d(int n) {
        Integer[] l=new Integer[4];
        for(int i=0,j=1000;i<4;i++,j/=10) {
            l[i]=n/j;
            n%=j;
        }
        return l;
    }
}
