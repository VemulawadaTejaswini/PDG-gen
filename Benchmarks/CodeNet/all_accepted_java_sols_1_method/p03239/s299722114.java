import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int T = sc.nextInt();
        int minc = 1001;
        for(int i=0; i<n; i++){
            int c = sc.nextInt();
            int t = sc.nextInt();
            if(T >= t){
                if(minc > c) minc = c;
            }
        }
        if(minc == 1001) System.out.println("TLE");
        else System.out.println(minc);
    }
}