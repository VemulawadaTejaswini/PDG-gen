import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String str = lines[0];
        int num = Integer.parseInt(str);

        int total;
        total = num * num * num;
        System.out.println(total);
        
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

