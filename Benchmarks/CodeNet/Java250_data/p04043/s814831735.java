import java.util.*;
public class Main {
    
    static void solve(){
        Scanner sc = new Scanner(System.in);
        int fives = 0, seven = 0;
        int[] a = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
        for(int i : a){
            if(i==5) fives++;
            if(i==7) seven++;
        }
        System.out.println(((fives==2)&&(seven==1)) ? "YES" : "NO");
        sc.close();
    }
    
    public static void main(String args[]) {
        solve();
    }
}