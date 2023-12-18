import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=2;i*i<=N;++i) {
            int count=0;
            while(N%i==0) {
                N/=i;
                count++;
            }
            hm.put(i,count);
        }
        if(hm.size()==0)
            System.out.println(1);
        else {
            int total=0;
            for(int vals:hm.values()) {
                total += (int)((-1+Math.sqrt(1+8*vals))/2);
            }
            System.out.println(total);
        }
    }
}