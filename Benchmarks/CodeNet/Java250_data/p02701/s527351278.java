import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String str = lines[0];
        int n = Integer.parseInt(str);
        String[] sss = new String[n];
        int nums = 1;
        for (int i = 1; i <= n; i++){
            sss[i - 1] = lines[i];
        }     
        Arrays.sort(sss);
        for (int j = 1; j <= n - 1; j++){
            if(!(sss[j-1].equals(sss[j]))){
                nums++;
            }
        }
        System.out.println(nums);
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