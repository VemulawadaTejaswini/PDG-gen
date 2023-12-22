import java.util.*;
import java.io.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String record=sc.next();
        int cnt=0;
        int mval=0;
        for(char ch:record.toCharArray()){
            if(ch=='S'){
                mval=Math.max(mval,cnt);
                cnt=0;
            }else{
                cnt++;
            }
        }
        mval=Math.max(mval,cnt);
        System.out.println(mval);
    }
}