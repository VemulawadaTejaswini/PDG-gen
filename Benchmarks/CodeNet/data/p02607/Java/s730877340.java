import java.util.*;
public class Main {
    static void solve(){
        Scanner sc = new Scanner(System.in);
        int NOC = sc.nextInt();
        int count = 1; int no = 0;
        while(NOC-->0){
             if(((sc.nextInt()&1)==1) && ((count&1)==1)) no++;
             count++;
        }
        System.out.println(no);
        sc.close();
    }
    
    public static void main(String args[]) {
        solve();
    }
}
