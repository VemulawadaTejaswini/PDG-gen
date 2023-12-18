import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String,Integer> map = new HashMap<>();
        map.put("AC",0);
        map.put("WA",0);
        map.put("TLE",0);
        map.put("RE",0);
        for(int i=0;i<n;i++){
            String s = sc.next();
            int num = map.get(s);
            num++;
            map.put(s,num);
        }
        System.out.println("AC x " + map.get("AC"));
        System.out.println("WA x " + map.get("WA"));
        System.out.println("TLE x " + map.get("TLE"));
        System.out.println("RE x " + map.get("RE"));


    }

}


