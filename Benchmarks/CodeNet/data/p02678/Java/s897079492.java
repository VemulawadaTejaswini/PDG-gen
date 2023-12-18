import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int numRooms = c.nextInt();
        int numPaths = c.nextInt();
        ArrayList<Integer>[] x = new ArrayList[numRooms+1];
        for (int i = 0; i < x.length; i++) {
            x[i] = new ArrayList<>();
        }
        int[] answer = new int[numRooms+1];
        //boolean[] checked = new boolean[numRooms+1];
        for (int i = 0; i < numPaths; i++) {
            int from = c.nextInt();
            int to = c.nextInt();
            x[from].add(to);
            x[to].add(from);
        }
        ArrayList<Integer> currentList = new ArrayList<>();
        currentList.add(1);
        answer[1] = -1;
        while(!currentList.isEmpty()){
            int currentIndex = currentList.remove(0);
            for (int i = 0; i < x[currentIndex].size(); i++) {
                int nextConnectedRoom = x[currentIndex].get(i);
                if(answer[nextConnectedRoom] == 0){
                    answer[nextConnectedRoom] = currentIndex;
                    currentList.add(nextConnectedRoom);
                }
            }
        }
        for (int i = 2; i < answer.length; i++) {
            if(answer[i] == 0){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        for (int i = 2; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
