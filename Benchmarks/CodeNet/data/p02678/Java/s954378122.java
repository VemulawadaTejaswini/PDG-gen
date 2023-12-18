import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Room rooms[] = new Room[n];
        for (int i = 0; i < n; i++) {
            rooms[i] = new Room(i);
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            rooms[a].adjacent.add(rooms[b]);
            rooms[b].adjacent.add(rooms[a]);
        }

        Queue<Room> search = new LinkedBlockingDeque<>();
        search.add(rooms[0]);
        while (search.size() > 0) {
            Room r = search.poll();
            for (Room room : r.adjacent) {
                if (room.from == -1) {
                    room.from = r.num;
                    search.add(room);
                }
            }
        }

        System.out.println("Yes");
        for (int i = 1; i < n; i++) {
            System.out.println(rooms[i].from + 1);
        }
    }
}

class Room {
    int num = -1;
    int from = -1;
    List<Room> adjacent = new ArrayList<>();

    public Room(int num) {
        this.num = num;
    }
}