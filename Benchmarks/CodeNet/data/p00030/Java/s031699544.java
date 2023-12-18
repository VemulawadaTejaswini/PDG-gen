

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line;
            
            while((line=br.readLine())!=null){
                if(line.equals(""))break;
                String[] splited = line.split(" ");
                int n = Integer.parseInt(splited[0]);
                s = Integer.parseInt(splited[1]);
                if(n==0&&s==0)break;if(n>=10)System.out.println("0");
                    combis(1,n);
                    System.out.println();
                count=0;
            }         
        }catch(Exception e){e.printStackTrace();}
        
    }
    static int[] com = new int[10];
    static int count = 0,s=0;
    static void combis(int st,int r){
        if(st<=r){
            for(int i=(st==1)? 0:com[st-1]+1;i<=9-r+st;i++){
                com[st]=i;
                combis(st+1,r);
            }
        }else{
            int sum=0; for(int i=1;i<=r;i++) sum+=com[i];
            if(sum==s)count++;
        }
        
        }
    static int _10Cn(int n){
            int _n=1,d=1;
            for(int i=1; i<=n;i++){
                _n*=11-i; d*=i;
            }
            return _n/d;
        }
}