import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int N=sc.nextInt();
        int pos[]=new int[102];
        for(int i=0;i<N;++i) {
            int no=sc.nextInt();
            pos[no]++;
        }
        int i;
        for(i=X;i>=0;--i) {
            if(pos[i]==0)
                break;
        }
        int j;
        for(j=X+1;j<102;++j) {
            if(pos[j]==0)
                break;
        }
        if(j-X<X-i) {
            System.out.println(j);
        } else {
            System.out.println(i);
        }

    }
}