import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String str = lines[0];
        int length = Integer.parseInt(str);
        String str1 = lines[1];
        String[] number = str1.split(" ");

        int[] ary = new int[length];
        for (int i = 0; i < length; i++){
            int num = Integer.parseInt(number[i]);
            ary[length - i - 1] = num;
        }
        for (int i = 0; i < length; i++){
            if (i == length - 1){
                System.out.println(ary[i]);
            } else{
                System.out.print(ary[i] + " ");
            }
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


