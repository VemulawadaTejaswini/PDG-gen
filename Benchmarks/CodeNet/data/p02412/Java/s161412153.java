import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        for(int d = 0; d < lines.length - 1; d++){
            String[] str = lines[d].split(" ");
            int[] q = new int[str.length];
            for ( int i = 0; i < str.length; i++){
                q[i] = Integer.parseInt(str[i]);
            }
            int n = q[0];
            int x = q[1];
            int num = 0;
            for (int i = 1; i <= n-2; i++){
                for(int j = i + 1; j <= n-1; j++){
                    for(int k = j + 1; k <= n; k++){
                        if( i + j + k == x){
                            num++;
                            break;
                        }
                    }
                }
            }
            System.out.println(num);
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
