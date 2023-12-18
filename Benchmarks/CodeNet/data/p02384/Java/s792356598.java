import java.util.*;
import java.lang.*;

public class Main {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        
        int[] surface = new int[6];
        for (int i = 0; i < 6; i++) {
            surface[i] = sc.nextInt();
        }
        //String s = sc.next();
        int qnum = sc.nextInt();
        
        Dice dice = new Dice(surface);
        
        for (int i = 0; i < qnum; i++) {
            ans = surface[dice.identify(sc.nextInt(), sc.nextInt())];
            System.out.println(ans);
        }
    }
}

class Dice {
    int[] surface = new int[6];
    //int[] newsurf = new int[6];
    String commands;
    
    Dice(int[] surf) {
        //commands = s;
        surface = Arrays.copyOf(surf, 6);
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
        
        int[][] ring = {{4, 2, 3, 5, 4},
                        {1, 4, 6, 3, 1},
                        {1, 2, 6, 5, 1},
                        {1, 5, 6, 2, 1},
                        {1, 3, 6, 4, 1},
                        {3, 2, 4, 5, 3}};
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (ring[i][j] == t && ring[i][j + 1] == f) {
                    return i;
                }
            }
        }
        return -1;
    }
}

