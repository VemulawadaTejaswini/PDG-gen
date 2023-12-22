import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums=new int[55];
        int primes=0;
        boolean tmp;
        int num=-7;
        flag:while(primes<55){
            num+=10;
            for(int i=2;i<Math.sqrt(num);i++){
                if(num%i==0)continue flag;
            }
            nums[primes]=num;
            primes++;
        }
        int n=sc.nextInt();
        for(int i=0;i<n;i++)System.out.print(nums[i]+" ");

    }
}