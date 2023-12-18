import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Collections;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        int l = sc.nextInt();
        
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        
        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(list.get(i));
        }
        
        System.out.println(sb);
    }
}
