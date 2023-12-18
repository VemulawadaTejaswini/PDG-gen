import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String str = lines[0];
        String[] str1 = str.split(" ");
        int W = Integer.parseInt(str1[0]);
        int H = Integer.parseInt(str1[1]);
        int x = Integer.parseInt(str1[2]);
        int y = Integer.parseInt(str1[3]);
        int r = Integer.parseInt(str1[4]);

        if (x <= 0 || y <= 0 || x + r <= 0 || y + r <=0){
            System.out.println("No");
            return;
        } else if (W >= x + r && H >= y + r){
            System.out.println("Yes");
            return;
        } else {
            System.out.println("No");
        }
    
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

