
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader ( new InputStreamReader (System.in));
        StringBuilder builder = new StringBuilder();
        int[][][] room = new int[4][3][10];
        int MAX = 9;
        int MIN = 0;
        int dataCount = Integer.parseInt(reader.readLine());
        int tou = 0;
        int floor = 0;
        int ban = 0;
        int num = 0;
        int touMAX = 4;
        int floorMAX = 3;
        int banMAX = 10;
        
        for (int i = 0;i < dataCount; i++ ) {
            String inputData = reader.readLine();
            String[] inputCol = inputData.split(" ");
            
            tou = Integer.parseInt(inputCol[0])-1;
            floor = Integer.parseInt(inputCol[1])-1;
            ban = Integer.parseInt(inputCol[2])-1;
            num = Integer.parseInt(inputCol[3]);
            
            if ( room[tou][floor][ban] + num >= 9)
                room[tou][floor][ban] = MAX;
            else if ( room[tou][floor][ban] + num <= 0)
                room[tou][floor][ban] = MIN;
            else {
                room[tou][floor][ban] += num;
            }
        }
        
        for (int x = 0; x < touMAX ; x++ ) {
            for (int y = 0 ; y < floorMAX ; y++) {
                for (int z = 0 ; z < banMAX ; z++) {
                    System.out.print(" ");
                    System.out.print(room[x][y][z]);
                }
                System.out.println("");
            }
            if ( x != touMAX -1)
                System.out.println("####################");
        }
    }
}