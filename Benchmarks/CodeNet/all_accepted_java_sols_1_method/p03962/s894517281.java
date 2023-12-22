import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> res = new HashSet<>();
        res.add(sc.nextInt());
        res.add(sc.nextInt());
        res.add(sc.nextInt());
        System.out.println(res.size());
    }
}
