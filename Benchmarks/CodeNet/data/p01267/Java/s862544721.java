import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
 
    while(kbd.hasNext()) {
        int n = kbd.nextInt();
        int a = kbd.nextInt();
        int b = kbd.nextInt();
        int c = kbd.nextInt();
        int x = kbd.nextInt();
        if(!(n==0 && a==0 && b==0 && c==0 && x==0)){
        solve(n, a, b, c, x);
        }
    }
    }
 
    static void solve(int n, int a, int b, int c, int x){
    int f=0;
    int m=n;
    int[][] r = new int[2][n];
    int i;
    int xx=x;
    boolean time = true;
    for(i=0; i<n; i++){
        r[0][i] = kbd.nextInt();
    }
 
    while(time && m>0){
        i=0;
        while(i<n && !check(r, xx, i)) i++;
        if(i<n && check(r, xx, i)){
        r[1][i] = -1;
        m--;
        }
        f++;
        if(f>10000 && m>0) time = false;
        xx = (a*xx+b)%c;
	// System.out.println(r[1][0]+" "+r[1][1]);
    }
     
    if(time){
        System.out.println(f-1);
    }
    else{
        System.out.println("-1");
    }
    }
 
    static boolean check(int[][] r, int xx, int i){
    boolean a = (r[0][i]==xx);
    boolean b = (r[1][i]==0);
    return a && b;
    }
}