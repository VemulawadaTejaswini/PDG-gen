import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String str = lines[0];
        String[] str1 = str.split(" ");
        int a = Integer.parseInt(str1[0]);
        int b = Integer.parseInt(str1[1]);
        int c = Integer.parseInt(str1[2]);
        int count = 0;

        for (int i = a; i <= b; i++){
         if (c % i == 0){
            count++;
         }
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

