import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] p=new int[1000000];
        int q=sc.nextInt();
        Set<Integer> l=new TreeSet<>();
        for(int i=0;i<q;i++) {
            int a=sc.nextInt();
            int v=sc.nextInt();
            p[a-1]+=v;
            l.add(a-1);
            int max=-1;
            int c=0;
            for(int j:l) {
                if(max<p[j]) {
                    max=p[j];
                    c=j+1;
                }
            }
            System.out.println(c+" "+max);
        }
    }
}

