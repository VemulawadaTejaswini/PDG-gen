import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        HashMap<Integer,Integer> hm=new HashMap<>();
        long sum=0;
        for(int i=0;i<n;++i) {
            a[i]=sc.nextInt();
            sum+=a[i];
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        int q=sc.nextInt();
        while(q-->0) {
            int b=sc.nextInt();
            int c=sc.nextInt();
            int val=hm.get(b);
            sum+=val*1l*(c-b);
            hm.remove(b);
            hm.put(c,hm.getOrDefault(c,0)+val);
            System.out.println(sum);
        }
    }
}