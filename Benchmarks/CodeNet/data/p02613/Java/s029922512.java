import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Map<String,Integer> map = new HashMap();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        map.put("AC",0);
        map.put("WA",0);
        map.put("TLE",0);
        map.put("RE",0);
        for(int i=0;i<n;i++){
            String s = sc.next();
            map.merge(s,1,Integer::sum);
        }
        System.out.println("AC x " + map.get("AC"));
        System.out.println("WA x " + map.get("WA"));
        System.out.println("TLE x " + map.get("TLE"));
        System.out.println("RE x " + map.get("RE"));
    }
}

class Monmo {
    
}

