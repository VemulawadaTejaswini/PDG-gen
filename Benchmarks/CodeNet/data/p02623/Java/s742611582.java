import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> rlist = new ArrayList<Integer>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int checksum = 0;
        for(int i = 0 ; i < n ;  i++){
            int a = sc.nextInt();
            checksum += a;
            if(checksum > k){}
            else rlist.add(a);
        }
        for(int i = rlist.size()-1 ; i >= 0 ;  i--){
            list.add(rlist.get(i));
        }
        checksum = 0;
        for(int i = 0 ; i < m ; i++){
            int b = sc.nextInt();
            checksum += b;
            if(checksum > k){}
            else list.add(b);
        }
        
        Monmo momo = new Monmo(k,list);
        for(int i = 0 ; i < list.size() ; i++){
            momo.sum(i);
            momo.check();
            momo.cmax();
        }
        momo.check();
        momo.cmax();
        momo.getc();
    }
}

class Monmo {
    ArrayList<Integer> mlist = new ArrayList<Integer>();
    int k;
    int sum;
    int c;
    int mx_c;
    int left;
    
    Monmo(int k,ArrayList<Integer> list){
        mlist = list;
        this.k = k;
        sum = 0;
        c = 0;
        mx_c = 0;
        left = 0;
    }
    
    void check(){
        if(k < sum){
            sum -= mlist.get(left++);
            c--;
        }
    }
    
    void sum(int n){
        sum += mlist.get(n);
        c++;
    }
    
    void cmax(){
        if(mx_c < c)mx_c=c;
    }
    
    void getc(){
        System.out.println(mx_c);
    }
}

