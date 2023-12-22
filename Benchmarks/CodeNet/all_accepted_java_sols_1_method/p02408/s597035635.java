import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String[]> list = new ArrayList<String[]>();
        int[][] tramp = new int[4][14];
        //S:0 H:1 c:2 D:3
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);
        for(int i = 0; i < n; i++) {
            String line1 = sc.nextLine();
            String[] linesp1 = line1.split(" ");
            list.add(linesp1);
        }

        for(int i = 0; i < list.size(); i++) {
            String mark = list.get(i)[0];
            int num = Integer.parseInt(list.get(i)[1]);
            if(mark.equals("S")) {
                tramp[0][num] = 1;
            }else if(mark.equals("H")) {
                tramp[1][num] = 1;
            }else if(mark.equals("C")) {
                tramp[2][num] = 1;
            }else if(mark.equals("D")) {
                tramp[3][num] = 1;
            }
        }
        
        for(int i = 0; i < 4; i++) {
            for(int j = 1; j <= 13; j++) {
                
                if(tramp[i][j] != 1) {
                    if(i == 0) {
                        System.out.println("S " + j);
                    } else if(i == 1) {
                        System.out.println("H " + j);
                    } else if(i == 2) {
                        System.out.println("C " + j);
                    } else if(i == 3) {
                        System.out.println("D " + j);
                    } 
                }
                
            }
        }
        
        
    }
}
