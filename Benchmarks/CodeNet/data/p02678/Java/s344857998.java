import java.util.*;

public class Main{

    static class Room{
        int num;
        List<Room> joint = new ArrayList<>();
        int mark = -1;
        Room(int num){
            this.num = num;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Room> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(new Room(i + 1));
        }

        for(int i = 0; i < m; i++){
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            list.get(a).joint.add(list.get(b));
            list.get(b).joint.add(list.get(a));
        }

        ArrayDeque<Room> q = new ArrayDeque<>();
        q.add(list.remove(0));

        while(!q.isEmpty()){
            Room room = q.poll();

            for(Room i : room.joint){
                if(i.mark == -1){
                    i.mark = room.num;
                    q.add(i);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Yes");

        for(Room i : list){
            sb.append("\n").append(i.mark);
        }
        System.out.println(sb);

    }
}
