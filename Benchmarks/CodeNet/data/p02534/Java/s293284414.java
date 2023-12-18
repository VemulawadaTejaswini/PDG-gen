import java.util.*;
import java.io.*;
public class Main{
    static PrintWriter out;
    static Scanner sc;
    public static void main(String[] args){
        sc=new Scanner(System.in);
        out=new PrintWriter(System.out);

        int t=1;
      //  t=sc.nextInt();
        while(t-->0){
            forEachTestcase();
        }

        out.close();
    }

    static void forEachTestcase(){
        int n=sc.nextInt();
        String ans="";
        String s="ACL";
        for(int i=0;i<n;i++){
            ans+=s;
        }
        System.out.println(ans);
    }

    static class modOpeation{
        static long mod;
        modOpeation(long mod){
            this.mod=mod;
        }
        static long mul(long a,long b){
            a%=mod;
            b%=mod;
            return (a*b)%mod;
        }
        static long add(long a,long b){
            a%=mod;
            b%=mod;
            return (a+b)%mod;
        }
        static long sub(long a,long b){
            a%=mod;
            b%=mod;
            return ((a-b)%mod+mod)%mod;
        }
        static long modPow(long a,long b){
            long ans=1;
            while(b>0){
                if(b%2==1)ans=mul(ans,a);
                a=mul(a,a);
                b>>=1;
            }
            return ans;
        }
        static long modInv(long a){
            return modPow(a,mod-2);
        }
        static long ifact[],fact[];
        static long nCr(int n,int r){
            if(r>n)return 0;
            return mul(fact[n],mul(ifact[r],ifact[n-r]));
        }
        static void initFactorial(int max){
            fact=new long[max];
            ifact=new long[max];
            fact[0]=ifact[0]=1;
            for (int i = 1; i <max ; i++) {
                fact[i]=mul(fact[i-1],i);
                ifact[i]=mul(ifact[i-1],modInv(i));
            }
        }
    }

}