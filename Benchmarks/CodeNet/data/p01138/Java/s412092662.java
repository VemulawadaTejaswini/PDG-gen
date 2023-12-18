import java.util.*;
import java.math.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static String start, end;
    static int n;
    static long[] Osaki;
    public static void main(String[] args) {
        while(read()){
            print();
        }
    }
    static boolean read(){
        n = sc.nextInt();
        if(n == 0)return false;

        Osaki = new long[216000];
        for(int i = 0; i < n; i++){
            start = sc.next();
            end = sc.next();
            solve();
        }
        return true;
    }
    static void solve(){
        String[] s = start.split(":");
        String[] e = end.split(":");
        int iStart = Integer.parseInt(s[2]) + Integer.parseInt(s[1])*60 + Integer.parseInt(s[0])*3600;
        int iEnd = Integer.parseInt(e[2]) + Integer.parseInt(e[1])*60 + Integer.parseInt(e[0])*3600;
        //System.out.println(iStart + " " + iEnd);
        for(int i = iStart; i < iEnd; i++){
            ++Osaki[i];
        }
    }

    static void print(){
        int max = -1;
        for(int i = 0; i < Osaki.length; i++){
            Math.max(max, Osaki[i]);
        }
        //System.out.println(Osaki[3600]);
        //System.out.println(max);
        Arrays.sort(Osaki);
        System.out.println(Osaki[Osaki.length-1]);
    }
}