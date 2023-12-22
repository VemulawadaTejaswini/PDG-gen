import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        String[] honList = new String[]{"2", "4", "5", "7", "9"};
        String[] ponList = new String[]{"0", "1", "6", "8"};
        String[] bonList = new String[]{"3"};
        for (String h : honList)
            if (line.endsWith(h)) {
                System.out.println("hon");
                return;
            }
        for (String p: ponList)
            if (line.endsWith(p)) {
                System.out.println("pon");
                return;
            }
        for (String b : bonList)
            if (line.endsWith(b)) {
                System.out.println("bon");
                return;
            }
    }
}
