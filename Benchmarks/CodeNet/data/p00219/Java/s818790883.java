import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] aice;
    public static void main(String[] args) {
        while(read()){
            solve();
        }
    }

    static boolean read(){
        n = sc.nextInt();
        if(n == 0)return false;

        aice = new int[10];
        for(int i = 0; i < n; i++){
            aice[sc.nextInt()]++;
        }
        return true;
    }

    static void solve(){
        for(int i = 0; i < aice.length; i++){
            if(aice[i] == 0){
                System.out.print("-");
            }else for(int j = 0; j < aice[i]; j++)System.out.print("*");
            System.out.println();
        }
    }

}