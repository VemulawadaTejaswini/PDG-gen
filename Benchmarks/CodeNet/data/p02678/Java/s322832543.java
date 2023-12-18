import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Room[] map = new Room[N+1];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Room A = map[a] == null ? new Room(a) : map[a];
            Room B = map[b] == null ? new Room(b) : map[b];
            A.addNeighbor(B);
            B.addNeighbor(A);
            map[a] = A;
            map[b] = B;
        }
        boolean result = constructSign(map);
        if(result){
            System.out.println("Yes");
            for(int i = 2; i < N+1; i++){
                System.out.println(map[i].sign);
            }
        }else{
            System.out.println("No");
        }
    }

    public static boolean constructSign(Room[] map){
        HashSet<Integer> visited = new HashSet<>();
        ArrayDeque<Room> queue = new ArrayDeque<>();
        queue.add(map[1]);
        visited.add(1);
        int counter = 1;
        while(!queue.isEmpty()){
            Room r = queue.poll();
            for(Room n: r.neighbor) {
                if(!visited.contains(n.num)){
                    n.sign =  r.num;
                    queue.offer(n);
                    visited.add(n.num);
                    counter++;
                }
            }
        }
        return  counter + 1 == map.length;
    }
}

class Room {
    int num;
    List<Room> neighbor;
    int sign;
    public Room(int num){
        this.num = num;
        this.neighbor = new ArrayList<>();
    }

    public void addNeighbor(Room room){
        if(room.num == 1) this.sign = 1;
        this.neighbor.add(room);
    }
}
