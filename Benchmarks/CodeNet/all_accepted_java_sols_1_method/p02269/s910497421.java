import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String[] sp = bf.readLine().split(" ");
            if (sp[0].equals("insert")){
                hashSet.add(sp[1]);
            }else {
                System.out.println(hashSet.contains(sp[1])?"yes":"no");
            }
        }

    }
}
