import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String c = sc.next();
        Monmo momo = new Monmo(c);
        do{
            momo.lef();
            momo.rig();
            //System.out.println(momo.left + " " + momo.right);
        }while(momo.overlap());
        System.out.println(momo.count);
    }
}

class Monmo {
    String s;
    int left;
    int right;
    int count;
    
    Monmo(String s){
        this.s = s;
        left = -1;            //lef,rigメソッドでインクリメントするので
        right = s.length();   //初期値は左右配列の上下プラマイ１
        count=0;
    }
    
    boolean overlap(){
        if(left >= right){
            return false;
        }else{
            count++;
            return true;
        }
    }
    
    void lef(){
        int flag = 0;
        left++;
        for(int i=left;i<s.length();i++){
            char sub = s.charAt(i);
            if(sub == 'W'){
                left=i;
                flag = 1;
                break;
            }
        }
        if(flag == 0)left = s.length();
    }
    
    void rig(){
        int flag = 0;
        right--;
        for(int i=right;i>=0;i--){
            char sub = s.charAt(i);
            if(sub=='R'){
                right=i;
                flag = 1;
                break;
            }
        }
        if(flag == 0)right = 0-1;
    }
    
}

