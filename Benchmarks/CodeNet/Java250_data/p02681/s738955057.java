import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    String[] lines = getStdin();
    String id = lines[0];
    char[] s = id.toCharArray();
    String newid = lines[1];
    char[] t = newid.toCharArray();
    
    if(s.length + 1 != t.length){
        System.out.println("No");
        return;
    }
    
    for (int i = 0; i < t.length -1; i++){
        if (s[i] != t[i]){
            System.out.println("No");
            return;
        }
        
    } System.out.println("Yes");
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