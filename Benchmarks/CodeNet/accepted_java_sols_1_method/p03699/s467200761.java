import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    static StringBuffer sb = new StringBuffer();
    public static void main(String args[]){
        int N=sc.nextInt(),sum=0,min=Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            int s=sc.nextInt();
            sum+=s;
            if(s%10!=0) min=Math.min(min,s);
        }
        if(min==Integer.MAX_VALUE) System.out.println(0);
        else System.out.println(sum%10!=0?sum:sum-min);
    }
}