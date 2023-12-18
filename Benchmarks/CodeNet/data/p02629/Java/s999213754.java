import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> arr = new ArrayList<Character>();
        long x = sc.nextLong();
        for(int i=1;i<30;i++){
            if(x==0)break;
            arr.add((char)(96 + x % 26));
            x /= 26;
        }
        Collections.reverse(arr);
        for(Character c:arr)System.out.print(c);
    }
}
