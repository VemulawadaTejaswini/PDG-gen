import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static long cl;
    public static char[] text;
    public static char[] rr;
    public static long[][] map;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        text = sc.next().toCharArray();
        rr = sc.next().toCharArray();
        map = new long[rr.length][text.length];
        search(0,0);
        System.out.println(search(0,0));
    }

    public static long search(int p1,int p2){
        if(map[p1][p2] > 0){
            return map[p1][p2];
        }
        else if(map[p1][p2] == -1)return 0;
        char ss1 = rr[p1];
        if(p1 == rr.length - 1){
            long t = 0;
            for (int i = p2;i < text.length;++i){
                char ss2 = text[i];
                if(ss2 == ss1){
                    ++t;
                }
            }
            return t;
        }
        else {
            long t = 0;
            for (int i = p2;i < text.length;++i){
                char ss2 = text[i];
                if(ss2 == ss1){
                   t += search(p1 + 1, i + 1);
                }
            }
            if(t == 0){
                map[p1][p2] = -1;
            }
            else map[p1][p2] = t;
            return t;
        }
    }


}

