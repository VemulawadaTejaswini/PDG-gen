import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        String color1=sc.next();
        String color2=sc.next();
        map.put(color1, sc.nextInt());
        map.put(color2, sc.nextInt());
        String tmp=sc.next();
        map.put(tmp, map.get(tmp)-1);
        System.out.println(map.get(color1)+" "+map.get(color2));
        
    }
}
