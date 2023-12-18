import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static long cl;
    public static char[] text;
    public static char[] rr;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        text = sc.next().toCharArray();
        rr = sc.next().toCharArray();
        search(0,0);
        System.out.println(cl);
    }

    public static void search(int p1,int p2){
        char ss1 = rr[p1];
        if(p1 == rr.length - 1){
            for (int i = p2;i < text.length;++i){
                char ss2 = text[i];
                if(ss2 == ss1){
                    ++cl;
                }
            }
        }
        else {
            for (int i = p2;i < text.length;++i){
                char ss2 = text[i];
                if(ss2 == ss1){
                    search(p1 + 1, i + 1);
                }
            }
        }
    }


}

