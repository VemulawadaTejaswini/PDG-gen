import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int mathNum = Integer.parseInt(sc.next());
        int priceMathNum = Integer.parseInt(sc.next());
        int start = Integer.parseInt(sc.next());
        List<Integer> list = new ArrayList<>();
        for (int x=1; x<=priceMathNum; x++) {
            list.add(Integer.parseInt(sc.next()));
        }
        int x = 0;
        int y = 0;
        for (int z:list) {
            if (start > z) {
                x++;
            } else {
                y++;
            }
        }
        
        System.out.println(x>y?y:x);
    }
}