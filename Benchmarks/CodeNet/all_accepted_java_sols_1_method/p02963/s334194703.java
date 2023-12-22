import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long s = Long.parseLong(sc.next());
        
        long ub = (int)1e9;
        long lb = 0;
        for(int i=0; i<100; i++){
            long mid = (ub+lb)/2;
            if(s > mid*mid){
                lb = mid;
            }else{
                ub = mid;
            }
        }
        
        long diff = ub*ub-s;
        long p = diff/ub;
        long q = diff%ub;
        
        System.out.println("0 0 "+q+" "+(ub-p)+" "+ub+" "+1);
        
        //System.out.println("ub : "+ub);
        //System.out.println((ub-p)*ub-q);
    }
}
