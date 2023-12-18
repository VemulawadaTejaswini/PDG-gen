
import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int count=0, n = in.nextInt();
        ArrayList<Integer> m = new ArrayList<>();

        for (int i = 0; i <n; i++) {
            int a = in.nextInt();
            m.add(a);
            if (m.get(i) %2 ==1 && i%2 == 1 ){
                count++;
            }
        }
        System.out.println(count);
    }
}
