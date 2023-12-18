import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long num=1;
        long max=1000000000000000000L;
        boolean flag=true;
        long[] nums = new long[N];
        for(int i=0; i<N; i++) {
            long enter = sc.nextLong();
            if(enter==0) {
                flag=false;
                break;
            }else {
                nums[i]=enter;
            }
        }
        if(flag) {
            int count=0;
            while(num<=max && count<N){
                num*=nums[count];
                count++;
            }
            if(num>max) {
                System.out.println(-1);
            }else {
                System.out.println(num);
            }
        }else {
            System.out.println(0);
        }
	}

}
