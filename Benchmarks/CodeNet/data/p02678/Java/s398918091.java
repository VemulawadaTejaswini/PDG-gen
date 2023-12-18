import java.util.*;

public class Main {
    static List<Room> lr;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        lr = new ArrayList<>(N+1);
        for(int t=0; t<=N; t++) {
            Room r = new Room(t);
            lr.add(r);
        }
        for(int i=1; i<=M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            lr.get(A).connectTo(B);
            lr.get(B).connectTo(A);
        }

        Queue<Room> qr = new LinkedList<>();
        Room firstRoom = lr.get(1);
        firstRoom.sirube = 0;
        firstRoom.steps = 1;
        qr.add(firstRoom);
        while(true) {
            Room r = qr.poll();
            if(r==null) break;
            for(int ind : r.connected) {
                Room rrr = lr.get(ind);
                if(rrr.sirube!=-1) continue;
                rrr.sirube = r.index;
                rrr.steps = r.steps + 1;
                qr.add(rrr);
            }
        }
//        for(Room r : lr) {
//            System.out.printf("id:%d, sirube:%d, steps:%s\n", r.index, r.sirube, r.steps);
//        }
        System.out.println("Yes");
        for(int i=2; i<=N; i++) {
            System.out.println(lr.get(i).sirube);
        }
    }

    static class Room {
        int index;
        int sirube = -1;
        int steps = Integer.MAX_VALUE;

        List<Integer> connected = new ArrayList<>();
        Room(int i) {
            this.index = i;
        }

        void connectTo(int target) {
            connected.add(target);
        }
    }
}
