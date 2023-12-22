import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String str = lines[0];
        int n = Integer.parseInt(str);
        int[] x = new int[n];
        long total = 0;
            for (int i = 0; i < n; i++){
                x[i] = i + 1;
            }
            for (int i = 0; i < n; i++){
                if(x[i] % 3 != 0 && x[i] % 5 != 0){
                    total = total + x[i];
                }
            }
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