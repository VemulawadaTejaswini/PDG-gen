import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int flag = 0;
        Monmo momo = new Monmo(7,k);
        
        for(int i=1;i<1000000;i++){ //19万回で処理が終わらない場合は存在しない可能性が高い
            if(momo.zero()){
                System.out.println(i);
                flag = 1;
                break;
            }
            momo.ten();
            momo.sho();
        }
        if(flag == 0){
            System.out.println("-1");
        }
    }
}

class Monmo {
    int n;
    int k;
    int rem;
    int verrem;
    
    Monmo(int n,int k){
        this.n=n;
        this.k=k;
        rem = n%k;
        verrem = n;
    }
    
    boolean zero(){
        if(rem == 0){
            return true;
        }else{
            return false;
        }
    }
    
    void ten(){
        verrem *= 10;
        verrem %= k;
        rem +=  verrem;
    }
    
    void sho(){
        rem %= k;
    }
    
}
