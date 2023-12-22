import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String str = lines[0];
        int k = Integer.parseInt(str);
        String[] cov = lines[1].split(" ");
        int a = Integer.parseInt(cov[0]);
        int b = Integer.parseInt(cov[1]);
        int c = b - a;
        
            for(int i = a; i <= b; i++){
                if (i % k == 0){
                    System.out.println("OK");
                    return;
                }
            }
            System.out.println("NG");
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