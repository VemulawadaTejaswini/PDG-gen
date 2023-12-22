import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();
        boolean check = false;
        if(A-K>0){
            A-=K;
            check = true;
        }
        else{
            K-=A;
            A=0;
        }
        if(!check&&B-K>0) B-=K;
        else if(!check) B=0;
        System.out.println(A+" "+B);
    }
}