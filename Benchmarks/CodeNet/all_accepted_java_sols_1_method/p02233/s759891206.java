import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> dp = new LinkedList<Integer>();
        dp.add(1);
        dp.add(1);
        if(n<=1)
            System.out.println(1);
        else{
            for(int i=2;i<=n;i++){
                dp.add(dp.get(i-1)+dp.get(i-2));
            }
            System.out.println(dp.get(n));
        }
    }
}

