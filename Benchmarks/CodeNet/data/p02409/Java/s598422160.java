
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author k16069kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        int block1[][] = new int[3][10];
        int block2[][] = new int[3][10];
        int block3[][] = new int[3][10];
        int block4[][] = new int[3][10];
        
        int index = 0;
        int count = 0;
        
        List<Integer> block = new ArrayList<>();
        List<Integer> flore = new ArrayList<>();
        List<Integer> room = new ArrayList<>();
        List<Integer> human = new ArrayList<>();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            if (index == 0) {
                index = Integer.parseInt(line);
            } else {
                java.util.StringTokenizer st = new StringTokenizer(line, " ");
                while (st.hasMoreTokens()) {
                    block.add(Integer.parseInt(st.nextToken()));
                    flore.add(Integer.parseInt(st.nextToken()));
                    room.add(Integer.parseInt(st.nextToken()));
                    human.add(Integer.parseInt(st.nextToken()));
                    count++;
                }
                if (index == count) {
                    break;
                }

            }
        }
        
        for (int i = 0; i < index; i++) {
            switch (block.get(i)){
                case 1:
                    block1[flore.get(i)-1][room.get(i)-1] += human.get(i);
                    break;
                case 2:
                    block2[flore.get(i)-1][room.get(i)-1] += human.get(i);
                    break;
                case 3:
                    block3[flore.get(i)-1][room.get(i)-1] += human.get(i);
                    break;
                case 4:
                    block4[flore.get(i)-1][room.get(i)-1] += human.get(i);
                    break;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + block1[i][j]);
            }
            System.out.println("");
        }
        for (int i = 0; i < 20; i++) {
            System.out.print("#");
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + block2[i][j]);
            }
            System.out.println("");
        }
        for (int i = 0; i < 20; i++) {
            System.out.print("#");
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + block3[i][j]);
            }
            System.out.println("");
        }
        for (int i = 0; i < 20; i++) {
            System.out.print("#");
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + block4[i][j]);
            }
            System.out.println("");
        }
    }
    
}

