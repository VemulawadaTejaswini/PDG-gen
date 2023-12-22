import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        Map<String, String> map = new HashMap<>();
        map.put("A", "T");
        map.put("T", "A");
        map.put("C", "G");
        map.put("G", "C");

        System.out.println(map.get(a));
    }
}
