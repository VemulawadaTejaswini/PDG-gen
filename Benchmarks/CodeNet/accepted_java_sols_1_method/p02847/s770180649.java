
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        switch(s){
            case "SUN":ans=7;break;
            case "MON":ans=6;break;
            case "TUE":ans=5;break;
            case "WED":ans=4;break;
            case "THU":ans=3;break;
            case "FRI":ans=2;break;
            case "SAT":ans=1;break;
        }
        System.out.println(ans);
    }
}