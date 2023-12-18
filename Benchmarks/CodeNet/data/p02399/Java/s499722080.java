import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String str = lines[0];
        String[] str1 = str.split(" ");
        long a = Long.parseLong(str1[0]);
        long b = Long.parseLong(str1[1]);
        long d;
        long r;
        double f;
        d = a / b;
        r = a % b;
        f = (double) a / (double) b;
        System.out.printf("%d %d %.9f",d,r,f);
    }
  private static String[] getStdin() {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> lines = new ArrayList<>();
    while (scanner.hasNext()) {
      lines.add(scanner.nextLine());
    }
    return lines.toArray(new String[lines.size()]);
  }
}

