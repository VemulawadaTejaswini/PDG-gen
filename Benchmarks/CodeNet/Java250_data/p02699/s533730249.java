import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String str = lines[0];
        String[] str1 = str.split(" ");
        int sheep = Integer.parseInt(str1[0]);
        int wolf = Integer.parseInt(str1[1]);

        if (sheep <= wolf){
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
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
