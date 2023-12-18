import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String str = lines[0];
        int num = Integer.parseInt(str);
        int h;
        int hamari;
        int num1;
        int m;
        int mamari;
        int num2;
        int s;

        h = num / 3600;
        hamari = h * 3600;
        num1 = num - hamari;
        m = num1 / 60;
        mamari = m * 60;
        num2 = num1 - mamari;
        s = num2;

        System.out.println(h + ":" + m + ":" + s);


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

