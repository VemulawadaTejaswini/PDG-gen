import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); //数列Sの長さ
        String[] s = sc.nextLine().split(" "); //数列S

        int q = Integer.parseInt(sc.nextLine()); //数列Tの長さ
        String[] t = sc.nextLine().split(" "); //数列T

        int count = 0; //出力結果（個数）
        for(int j=0; j<q; j++) {
            for(int i=0; i<n; i++) {
                if(s[i].equals(t[j])){
                    count++;
                    break; 
                }
            }
        }
        System.out.println(count);
    }
}

