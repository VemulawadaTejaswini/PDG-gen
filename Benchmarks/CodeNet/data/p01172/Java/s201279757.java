import java.util.*;
 
public class Main{
 
    void solve(){
    Scanner sc = new Scanner(System.in);
 
    while(true){
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x==0 && y==0) break;
 
        int[] aa = new int[1000001];
        Arrays.fill(aa, -1);
        int a = 0, b = 0;
        for(int i=0;;i++){
        x = x%y;
        if(aa[x]!=-1){
            a = aa[x];
            b = i-aa[x];
            if(x==0) b = 0;
            break;
        }else{
            aa[x] = i;
        }
        x *= 10;
        }
 
        System.out.println(a+" "+b);
    }
    }
 
    public static void main(String[] args){
       new Main().solve();
    }
}