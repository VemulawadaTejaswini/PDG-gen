import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt();
        long n=0,p=sc.nextLong(),res=0;
        for(int i=1;i<N;i++){
            n=sc.nextLong();
            if(p>n){
                res+=p-n;
            }
            else{
                p=n;
            }
        }
        System.out.println(res);
    }
}
