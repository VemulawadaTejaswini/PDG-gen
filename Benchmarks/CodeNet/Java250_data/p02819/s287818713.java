import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N==2){
            System.out.println(2);
            return;
        }
        if(N==3){
            System.out.println(3);
            return;
        }
        int limit = 1000000;
        ArrayList<Integer> Sosuu = new ArrayList<Integer>();
        int warukazu, amari;
        
        Sosuu.add(2);
        Sosuu.add(3);
        for (int i = 3; i < limit; i += 2) {
            warukazu = 0;
            amari = 1;
            while (amari != 0) {
                amari = i % Sosuu.get(warukazu);
                if (Sosuu.size() < warukazu || Sosuu.get(warukazu) > i / 2) {
                    amari = 0;
                    Sosuu.add(i);
                    if(i>=N){
                        System.out.println(i);
                        return;
                    }
                    break;
                }
                warukazu++;
            }
        }
    }
}