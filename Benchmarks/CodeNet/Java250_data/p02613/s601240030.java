import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

import static java.lang.Math.max;




public class Main {

  

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<String,Integer> map = new HashMap<>();
        map.put("AC",0);
        map.put("WA",0);
        map.put("TLE",0);
        map.put("RE",0);

        while(n-->0){

            String word = sc.next();
            map.put(word,map.get(word)+1);

        }
        System.out.println("AC "+"x "+map.get("AC"));
        System.out.println("WA "+"x "+map.get("WA"));
        System.out.println("TLE "+"x "+map.get("TLE"));
        System.out.println("RE "+"x "+map.get("RE"));
    }

}