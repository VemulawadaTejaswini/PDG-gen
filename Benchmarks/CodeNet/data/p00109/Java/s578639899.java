import java.util.*;

class Main{

    char[] in;
    int p;

    void solve(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n-->0){
            in = sc.next().toCharArray();
            p = 0;     
            System.out.println(expr());            
        }
    }

    int expr(){
        int a = term();
        while(p<in.length && (in[p]=='+' || in[p]=='-')){
            boolean boo = in[p]=='+';
            p++;
            int b = term();
            if(boo) a += b;
            else a -= b;
        }
        return a;
    }

    int term(){
        int a = factor();
        while(p<in.length && (in[p]=='*' || in[p]=='/')){
            boolean boo = in[p]=='*';
            p++;
            int b = factor();
            if(boo) a *= b;
            else a /= b;
        }
        return a;
    }

    int factor(){
        if(p<in.length && in[p]=='('){
            p++;
            int res = expr();
            p++;
            return res;
        }
        else return digit();
    }

    int digit(){
        int res = 0;
        while(p<in.length && Character.isDigit(in[p])){
            res = res*10 + (in[p]-'0');
            p++;
        }
        return res;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}