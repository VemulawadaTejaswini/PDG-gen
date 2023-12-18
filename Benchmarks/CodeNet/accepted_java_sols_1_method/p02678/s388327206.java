import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // 部屋番号はすべて0始まりに直す
        HashMap<Integer, ArrayList<Integer>> passway = new HashMap<Integer, ArrayList<Integer>>();
        Deque<Integer> nextVisitingQueue = new ArrayDeque<>();
        Integer[] toRoom = new Integer[N];
        
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt()-1;
            int B = sc.nextInt()-1;

            if (!passway.containsKey(A)) {
                passway.put(A, new ArrayList<Integer>());
            }
            if (!passway.containsKey(B)) {
                passway.put(B, new ArrayList<Integer>());
            }
            passway.get(A).add(B);
            passway.get(B).add(A);
        }

        nextVisitingQueue.add(0);
        toRoom[0] = -1;
        int visitedRoomCount = 0;

        Integer currentRoom;
        while ( (currentRoom = nextVisitingQueue.poll()) != null ){
            visitedRoomCount += 1;
            List<Integer> roomList = passway.get(currentRoom);
            for (Integer room : roomList) {
                if (toRoom[room] == null) {
                    toRoom[room] = currentRoom;
                    nextVisitingQueue.add(room);
                }
            }
        }

        if (visitedRoomCount == N) {
            System.out.println("Yes");
            for (int i = 1; i < N; i ++) {
                System.out.println(toRoom[i]+1);
            }
        } else {
            System.out.println("No");
        }
    }
}