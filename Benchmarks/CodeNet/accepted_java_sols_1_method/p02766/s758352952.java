import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        String s="";
        while(N>=1){
            s+=(N%K);
            N/=K;
        }
        System.out.println(s.length());



    }
}
