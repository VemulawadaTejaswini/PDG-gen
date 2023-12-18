import java.io.CharArrayReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<5;i++)arr.add(sc.nextInt());
        int k=sc.nextInt();
        Collections.sort(arr);
        if(arr.get(4)-arr.get(0)>k)System.out.println(":(");
        else System.out.println("Yay!");
    }
}
