import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String str = lines[0];
        long num = Long.parseLong(str);
        long sum = 100;
        int count = 0;

        while (sum < num){
            sum = sum + (sum * 1 / 100);
            count++;
        }
        System.out.println(count);
             
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
