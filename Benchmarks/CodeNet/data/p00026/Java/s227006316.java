
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] field = new int[10][10];
        int[] hogeInt = new int[3];
        
        while(in.hasNext()) {
            String hoge[] = in.next().split(",");
            for(int i=0; i<3; i++) hogeInt[i] = Integer.parseInt(hoge[i]);
            switch (hogeInt[2]) {
                case 3:
                	if(hogeInt[0]-2 >= 0) field[hogeInt[0]-2][hogeInt[1]]++;
                	if(hogeInt[0]+2 <= 9) field[hogeInt[0]+2][hogeInt[1]]++;
                	if(hogeInt[1]-2 >= 0) field[hogeInt[0]][hogeInt[1]-2]++;
                	if(hogeInt[1]+2 <= 9) field[hogeInt[0]][hogeInt[1]+2]++;
                case 2:
                	if(hogeInt[0]-1 >= 0 && hogeInt[1]-1 >= 0) field[hogeInt[0]-1][hogeInt[1]-1]++;
                	if(hogeInt[0]-1 >= 0 && hogeInt[1]+1 <= 9) field[hogeInt[0]-1][hogeInt[1]+1]++;
                	if(hogeInt[0]+1 <= 9 && hogeInt[1]-1 >= 0) field[hogeInt[0]+1][hogeInt[1]-1]++;
                	if(hogeInt[0]+1 <= 9 && hogeInt[1]+1 <= 9) field[hogeInt[0]+1][hogeInt[1]+1]++;
                case 1:
                	if(hogeInt[1]-1 >= 0) field[hogeInt[0]][hogeInt[1]-1]++;
                	if(hogeInt[1]+1 <= 9) field[hogeInt[0]][hogeInt[1]+1]++;
                	if(hogeInt[0]-1 >= 0) field[hogeInt[0]-1][hogeInt[1]]++;
                	if(hogeInt[0]+1 <= 9) field[hogeInt[0]+1][hogeInt[1]]++;
            }
            int max = 0, count = 0;
            for(int i=0; i<10; i++) {
                for(int j=0; j<10; j++) {
                    if(field[i][j] > max) max = field[i][j];
                    if(field[i][j] == 0) count++;
                }
            }
            System.out.println(count);
            System.out.println(max);
        }
    }
}