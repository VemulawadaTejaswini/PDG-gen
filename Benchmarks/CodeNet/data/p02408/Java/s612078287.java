import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String str1 = lines[0];
        int n = Integer.parseInt(str1);
        Boolean heart[] = {false, false, false, false, false, false, false, false, false, false, false, false, false};
        Boolean club[] = {false, false, false, false, false, false, false, false, false, false, false, false, false};
        Boolean diamond[] = {false, false, false, false, false, false, false, false, false, false, false, false, false};
        Boolean spade[] = {false, false, false, false, false, false, false, false, false, false, false, false, false};
        for(int i = 1; i <= n; ++i){
            String[] cinfo = lines[i].split(" ");
            String pic = cinfo[0];
            int cnum = Integer.parseInt(cinfo[1]);
            cnum--;
            if(pic.equals("H")){
                heart[cnum] = true;
            } else if(pic.equals("S")){
                spade[cnum] = true;
            } else if(pic.equals("C")){
                club[cnum] = true;
            } else if(pic.equals("D")){
                diamond[cnum] = true;
            }
        }
        for(int i = 0; i < 13; ++i){
            if(spade[i] == false){
                System.out.printf("%s %d", "S", i + 1);
                System.out.println();
            }
        }
        for(int i = 0; i < 13; ++i){
            if(heart[i] == false){
                System.out.printf("%s %d", "H", i + 1);
                System.out.println();
            }
        }
        for(int i = 0; i < 13; ++i){
            if(club[i] == false){
                System.out.printf("%s %d", "C", i + 1);
                System.out.println();
            }
        }
        for(int i = 0; i < 13; ++i){
            if(diamond[i] == false){
                System.out.printf("%s %d", "D", i + 1);
                System.out.println();
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
