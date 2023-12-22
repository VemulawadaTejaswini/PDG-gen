
import java.util.*;

public class Main {
    static String S;
    static long K;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        S=scanner.next();
        K=scanner.nextLong();
        solve();
    }
    public static void solve(){
        int first1Lnegth=0;
        char nextChar=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='1'){
                first1Lnegth++;
            }else{
                nextChar=S.charAt(i);
                break;
            }
        }
        if(K<=first1Lnegth){
            put(1);
        }else{
            put(nextChar);
        }
    }

    public static void put(Object object){
        System.out.println(object);
    }
    public static String format(String string,Object... args){
        return String.format(string,args);
    }

    public static class Pair{
        final public int x,y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
}
