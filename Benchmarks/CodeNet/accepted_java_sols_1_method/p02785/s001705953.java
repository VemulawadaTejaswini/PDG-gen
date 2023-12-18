import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int po[]=new int[n];
        for(int i=0;i<n;i++){
            po[i]=sc.nextInt();
        }
        Arrays.sort(po);
        long sum=0;
        for(int i=0;i<n-k;i++)sum+=po[i];
        System.out.println(sum);
    }
}
