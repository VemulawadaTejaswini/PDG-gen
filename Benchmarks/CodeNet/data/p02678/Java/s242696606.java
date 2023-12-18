
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        List<Line> lines = new ArrayList<>();

        Map<Integer, Room> rooms = new HashMap<>();
        for (int i=1; i<=N; i++) {
            rooms.put(i, new Room(i));
        }

        for (int i=0; i<M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            Room roomA = rooms.get(a);
            Room roomB = rooms.get(b);
            roomA.addNeighbor(roomB);
            roomB.addNeighbor(roomA);
        }

        Room room1 = rooms.get(1);
        for (Room neighbor : room1.neighbors) {
            neighbor.step++;
            neighbor.marks.add(room1);
        }
        for (Room neighbor : room1.neighbors) {
            mark(room1, neighbor);
        }

        for (int i=2; i<=N; i++) {
            Room room = rooms.get(i);
            if (room.marks.isEmpty()) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");

        for (int i=2; i<=N; i++) {
            Room room = rooms.get(i);
            Room next = room.marks.iterator().next();
            System.out.println(next.number);
        }
    }

    private static void mark(Room fromRoom, Room toRoom) {
//        System.out.println("fromRoom=" + fromRoom + ", toRoom=" + toRoom);

        List<Room> nextList = new ArrayList<>();
        for (Room neighbor : toRoom.neighbors) {
            if (!neighbor.marks.isEmpty() && neighbor.step <= toRoom.step) {
//                System.out.println("neighbor.marks.isEmpty");
                continue;
            }
            if (neighbor.equals(fromRoom)) {
//                System.out.println("neighbor.equals(fromRoom)");
                continue;
            }
            neighbor.marks.add(toRoom);
            nextList.add(neighbor);
        }

        for (Room neighbor : nextList) {
            mark(toRoom, neighbor);
        }
    }

    static class Room {
        int number;
        int step;
        List<Room> neighbors = new ArrayList<>();
        Set<Room> marks = new HashSet<>();

        public Room(int number) {
            this.number = number;
        }

        public void addNeighbor(Room neighbor) {
            this.neighbors.add(neighbor);
        }

        @Override
        public String toString() {
            return String.format("[%d] ", number);
        }
    }

    static class Line {
        int a;
        int b;
        Line(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return a + "," + b;
        }
    }
}