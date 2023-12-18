import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        
        String str;
        String[] str1;
        int ver;
        int par;

        for (int i = 0; i < lines.length; i++){
            str = lines[i];
            str1 = str.split(" ");
            ver = Integer.parseInt(str1[0]);
            par = Integer.parseInt(str1[1]);

            for (int j = 0; j < ver; j++){
                for (int k = 0; k < par; k++){
                    System.out.print("#");
                }  System.out.println();
            }
            if(i != lines.length - 1){
                System.out.println();
            }
            
            
            if (ver == 0 && par == 0){
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



