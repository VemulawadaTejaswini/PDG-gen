import java.util.*;
import java.lang.*;

public class Main {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int[] surface = new int[6];
        for (int i = 0; i < 6; i++) {
            surface[i] = sc.nextInt();
        }
        String s = sc.next();
        
        Dice dice = new Dice(s, surface);
    
        System.out.println(dice.step());

    }
}

class Dice {
    int[] oldsurf = new int[6];
    int[] newsurf = new int[6];
    String commands;
    
    Dice(String s, int[] surface) {
        commands = s;
        for (int i = 0; i < 6; i++) {
            oldsurf[i] = surface[i];
        }
    }
    
    int step() {
        for (int i = 0; i < commands.length(); i++) {
            char command = commands.charAt(i);
            if (command == 'N') {
                int[] array = {1, 5, 2, 3, 0, 4};
                setNum(array);
            } else if (command == 'S') {
                int[] array = {4, 0, 2, 3, 5, 1};
                setNum(array);
            } else if (command == 'E') {
                int[] array = {3, 1, 0, 5, 4, 2};
                setNum(array);
            } else if (command == 'W') {
                int[] array = {2, 1, 5, 0, 4, 3};
                setNum(array);
            }
            
            for(int j = 0; j < 6; j++) {
                oldsurf[j] = newsurf[j];
            }
        }
        return newsurf[0];
    }
    
    void setNum(int[] array) {
        for (int i = 0; i < 6; i++) {
            newsurf[i] = oldsurf[array[i]];
        }
    }
}

