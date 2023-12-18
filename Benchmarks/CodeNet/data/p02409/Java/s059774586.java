import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String str1 = lines[0];
        int n = Integer.parseInt(str1);
        int tower1[][] = new int[3][10];
        int tower2[][] = new int[3][10];
        int tower3[][] = new int[3][10];
        int tower4[][] = new int[3][10];
        for(int i = 1; i <= n; ++i){
            String[] tinfo = lines[i].split(" ");
            int b = Integer.parseInt(tinfo[0]);
            int f = Integer.parseInt(tinfo[1]);
            int r = Integer.parseInt(tinfo[2]);
            int v = Integer.parseInt(tinfo[3]);
            if(b == 1){
                tower1[f - 1][r - 1] += v;
            } else if(b == 2){
                tower2[f - 1][r - 1] += v;
            } else if(b == 3){
                tower3[f - 1][r - 1] += v;
            } else if(b == 4){
                tower4[f - 1][r - 1] += v;
            }
        }
        for(int i = 0; i < 3; ++i){
            for(int j = 0; j < 10; ++j){
                System.out.print(" ");
                System.out.print(tower1[i][j]);
            }
            System.out.println();
        }
        System.out.println("####################");
        for(int i = 0; i < 3; ++i){
            for(int j = 0; j < 10; ++j){
                System.out.print(" ");
                System.out.print(tower2[i][j]);
            }
            System.out.println();
        }
        System.out.println("####################");
        for(int i = 0; i < 3; ++i){
            for(int j = 0; j < 10; ++j){
                System.out.print(" ");
                System.out.print(tower3[i][j]);
            }
            System.out.println();
        }
        System.out.println("####################");
        for(int i = 0; i < 3; ++i){
            for(int j = 0; j < 10; ++j){
                System.out.print(" ");
                System.out.print(tower4[i][j]);
            }
            System.out.println();
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

