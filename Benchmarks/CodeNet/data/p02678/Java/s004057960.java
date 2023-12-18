import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        class Room {
            int depth = -1;
            int conFrom;
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Room> rooms = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            rooms.add(new Room());
        }
        int[][] routes = new int[m][2];
        for (int i = 0; i < m; i++) {
            routes[i][0] = sc.nextInt();
            routes[i][1] = sc.nextInt();

            if (routes[i][0] > routes[i][1]) {
                int tmp = routes[i][0];
                routes[i][0] = routes[i][1];
                routes[i][1] = tmp;
            }

        }

        Deque<Integer> next = new ArrayDeque<>();
        next.add(1);
        rooms.get(0).depth = 1;

        while (!next.isEmpty()) {
            int i = next.poll();

            for (int j = 0; j < routes.length; j++) {
                
                if (i == routes[j][0]) {
                    if(rooms.get(routes[j][1]-1).depth < 0) {
                        rooms.get(routes[j][1]-1).depth = rooms.get(i-1).depth +1;
                        rooms.get(routes[j][1]-1).conFrom = i;
                        next.add(routes[j][1]);
                    }
                } else if (i == routes[j][1]) {
                    if(rooms.get(routes[j][0]-1).depth < 0) {
                        rooms.get(routes[j][0]-1).depth = rooms.get(i-1).depth +1;
                        rooms.get(routes[j][0]-1).conFrom = i;
                        next.add(routes[j][0]);
                    }
                }
            }                
        }

        System.out.println("Yes");
        for (int i = 1; i < n; i++) {
            System.out.println(rooms.get(i).conFrom);
        }


    }
}