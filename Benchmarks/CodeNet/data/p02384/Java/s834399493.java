import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        Dice dice = new Dice(sc.nextInt(),
                             sc.nextInt(),
                             sc.nextInt(),
                             sc.nextInt(),
                             sc.nextInt(),
                             sc.nextInt());
        
        //String s = sc.next();
        int qnum = sc.nextInt();
        
        
        
        for (int i = 0; i < qnum; i++) {
            ans = dice.identify(sc.nextInt(), sc.nextInt());
            System.out.println(ans);
        }
    }
}

class Dice {
    //int[] newsurf = new int[6];
    String commands;
    int[] surface = new int[6];
    Dice(int a, int b, int c, int d, int e, int f) {
        //commands = s;
        surface[0] = a;
        surface[1] = b;
        surface[2] = c;
        surface[3] = d;
        surface[4] = e;
        surface[5] = f;
    }
    
    /*
    int step() {
        for (int i = 0; i < commands.length(); i++) {
            char command = commands.charAt(i);
            if (command == 'N') {
                int[] array = {1, 5, 2, 3, 0, 4};
                setNew(array);
            } else if (command == 'S') {
                int[] array = {4, 0, 2, 3, 5, 1};
                setNew(array);
            } else if (command == 'E') {
                int[] array = {3, 1, 0, 5, 4, 2};
                setNew(array);
            } else if (command == 'W') {
                int[] array = {2, 1, 5, 0, 4, 3};
                setNew(array);
            }
            
            for(int j = 0; j < 6; j++) {
                oldsurf[j] = newsurf[j];
            }
        }
        return newsurf[0];
    }
    
    
    void setNew(int[] array) {
        for (int i = 0; i < 6; i++) {
            newsurf[i] = oldsurf[array[i]];
        }
    }
     */
    
    int identify(int t, int f) {
        
        int[][] ring = {{3, 1, 2, 4, 3},
                        {0, 3, 5, 2, 0},
                        {0, 1, 5, 4, 0},
                        {0, 4, 5, 1, 0},
                        {0, 2, 5, 3, 0},
                        {2, 1, 3, 4, 2}};
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (surface[ring[i][j]] == t &&
                    surface[ring[i][j + 1]] == f) {
                    return surface[i];
                }
            }
        }
        return -1;
    }
}

