import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Room[] room = new Room[n + 1];
        for (int i = 0; i < room.length; i++) {
            room[i] = new Room(i, n + 1);
        }

        for (int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to   = sc.nextInt();

            room[from].addRoom(to);
            room[to].addRoom(from);
        }

        room[1].sign = 1;

        mark(room);

        System.out.println("yes");
        for (int i = 2; i < room.length; i++) {
            System.out.println(room[i].sign);
        }
    }

    private static void mark(Room[] room) {
        Queue<Room> queue = new LinkedList<>();

        queue.add(room[1]);

        while (!queue.isEmpty()) {
            Room r = queue.poll();

            for (int i = 0; i < r.size; i++) {
                if (room[r.rooms[i]].sign == -1) {
                    room[r.rooms[i]].sign = r.no;
                    queue.add(room[r.rooms[i]]);
                }
            }
        }
    }
}

class Room {
    /** 部屋番号 */
    public int no;
    /** 繋がっている部屋 */
    public int[] rooms;
    /** 繋がっている部屋の数 */
    public int size = 0;
    /** 最適な移動部屋 */
    public int sign = -1;

    public Room(int no, int n) {
        this.no = no;
        this.rooms = new int[n];
    }

    public void addRoom(int no) {
        rooms[size++] = no;
    }
}