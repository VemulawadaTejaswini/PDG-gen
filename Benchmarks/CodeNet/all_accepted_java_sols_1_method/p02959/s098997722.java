import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Integer> monsters = new ArrayList<>();
        List<Integer> temp =  new ArrayList<>();
        for (int x=1;x<=n+1;x++) {
            monsters.add(Integer.parseInt(sc.next()));
        }
        for (int x=1;x<=n;x++) {
            temp.add(Integer.parseInt(sc.next()));
        }
        long res = 0;
        int a = 0;
        int b = monsters.get(0);
        int c = 0;
        for (int x=2;x<=n+1;x++) {
            a = b;
            b = monsters.get(x-1);
            c = temp.get(x-2);
            if (a<c) {
                if (a+b<=c) {
                    res = res+a+b;
                    b=0;
                } else {
                    res +=c;
                    b = b+a-c;
                }
            } else {
                res+=c;
            }
            
        }
        System.out.println(res);
    }
        
}
