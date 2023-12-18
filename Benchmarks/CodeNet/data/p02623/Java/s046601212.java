import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m  =sc.nextInt();
        int k=sc.nextInt();
        PriorityQueue<Integer> A=new PriorityQueue<>();
        PriorityQueue<Integer> B=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            A.add(sc.nextInt());
        }
        for(int i=0;i<m;i++){
            B.add(sc.nextInt());
        }
        int val=0,count=0;
        int i=0,j=0;
        while(val<=k && A.size()!=0 && B.size()!=0) {
//            System.out.println(val);
            if (A.peek() < B.peek()) {
                val += A.poll();
                if (val <= k) {
                    count++;
                }
                i++;
            } else {
                val += B.poll();
                if (val <= k) {
                    count++;
                }
                j++;
            }
        }
        if(val<k) {
            while (A.size() != 0) {
                val += A.poll();
                if (val <= k) {
                    count++;
                }
            }
            while (B.size() != 0) {
                val += B.poll();
                if (val <= k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
