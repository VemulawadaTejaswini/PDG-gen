import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> hash = new HashMap<>();
        int n = sc.nextInt();
        for (int i=0;i<n;i++)hash.put(sc.next(),1);
        System.out.println(hash.size());
    }
}
