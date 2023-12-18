import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        
        
        
        
        for (int i = 0; i < lines.length; i++){
            int num = Integer.parseInt(lines[i]);
            int zero = 0;
                if (num == zero){
                    continue;
                }
            System.out.println("Case " + (i + 1) + ": " + num);
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

