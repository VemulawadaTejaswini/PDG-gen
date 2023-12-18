import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        
        for (int i = 0; i < lines.length; i++){
            String str = lines[i];
            String[] str1 = str.split(" ");
            int a = Integer.parseInt(str1[0]);
            String op = str1[1];
            int b = Integer.parseInt(str1[2]);

                if (op.equals("+")){
                    System.out.println(a + b);
                } else if (op.equals("-")){
                    System.out.println(a - b);
                } else if (op.equals("*")){
                    System.out.println(a * b);
                } else if (op.equals("/")){
                    System.out.println(a / b);
                } else if (op.equals("?")){
                    return;
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

