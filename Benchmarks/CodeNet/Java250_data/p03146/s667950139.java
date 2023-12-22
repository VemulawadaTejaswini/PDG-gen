import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Map<Integer,Integer> po=new HashMap<Integer,Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        for(;!(po.containsKey(n));count++){
            po.put(n,n);
            if(n%2==0)n/=2;
            else n=n*3+1;
        }
        System.out.println(count);
    }
}
