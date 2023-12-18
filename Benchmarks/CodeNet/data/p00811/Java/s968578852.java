import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main{

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] ps = getPrimes();
        while(true){
            long m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(m+a+b==0)break;
            double e = 1e-9;
            long ansp=0,ansq=0;
            long max  =-(1<<29);
            for (int i = 0; i < ps.length; i++) {
                for (int j = i; j < ps.length; j++) {
                    long p = ps[i];
                    long q = ps[j];
                    long pq  =p*q;
                    if(pq>m)break;
                    if((double)a/b <= (double)p/q+e && (double)p/q <= 1+e){
                        if(max < pq){
                            max= pq;
                            ansp=p;
                            ansq=q;
                        }
                    }
                }
            }
            System.out.println(ansp+" "+ansq);
        }
    }
    static int[] getPrimes(){
        List<Integer>list = new LinkedList<Integer>();
        boolean[] p = new boolean[100000/2 + 10];
        Arrays.fill(p, true);
        p[0]=p[1]=false;
        for (int i = 2; i*i <= p.length; i++) {
            if(p[i]){
                for (int j = i+i; j < p.length; j+=i) {
                    p[j]=false;
                }
            }
        }
        for (int i = 0; i < p.length; i++) {
            if(p[i])list.add(i);
        }
        
        Integer[] res =list.toArray(new Integer[list.size()]);
        int[] res2 = new int[res.length];
        for (int i = 0; i < res2.length; i++) {
            res2[i]=res[i];
        }
        return res2;
    }
}