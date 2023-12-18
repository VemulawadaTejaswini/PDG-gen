import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int[] v;
    public static void main(String[] args) {
        while(sc.hasNext()){
            while(true){
                v = new int[101];
                int s = sc.nextInt();
                int t = sc.nextInt();
                if (s == 0 && t == 0)break;
                v[s]++;
                v[t]++;
            }
            int odd = 0;
            for(int i:v)if(i%2 == 1)odd++;
            System.out.println(odd!=2?"NG": v[1]%2==1 && v[2]%2==1?"OK":"NG");
        }
    }
}