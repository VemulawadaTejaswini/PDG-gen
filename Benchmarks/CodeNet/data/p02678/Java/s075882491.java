
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roomNum = scan.nextInt();
        ArrayList<Room> rooms = new ArrayList<>();
        for (int i = 0; i <= roomNum; i++) {
            rooms.add(new Room(i));
        }

        int routeNum=scan.nextInt();
        for (int i = 0; i <routeNum ; i++) {
            Room room1=rooms.get(scan.nextInt());
            Room room2=rooms.get(scan.nextInt());
            room1.connect(room2);
            room2.connect(room1);
        }


        HashSet<Room> roomNow = new HashSet<>();
        HashSet<Room> tempRoom = new HashSet<>();
        rooms.get(1).setMinStep(0);
        roomNow.add(rooms.get(1));
        while (!roomNow.isEmpty()) {
            for(Room oneRoom:roomNow){
                for (Room nextRoom:oneRoom.getNext()){
                    if (oneRoom.getMinStep()+1<nextRoom.getMinStep()){
                        nextRoom.setMinStep(oneRoom.getMinStep()+1);
                        nextRoom.setMinPath(oneRoom);
                        tempRoom.add(nextRoom);
                    }
                }
            }
            roomNow=tempRoom;
            tempRoom=new HashSet<>();
        }

        boolean ifOk=true;
        for (int i = 2; i <=roomNum ; i++) {
            if(rooms.get(i).getMinPath()==null){
                ifOk =false;
                break;
            }
        }
        if(ifOk){
            System.out.println("Yes");
            for (int i = 2; i <=roomNum ; i++) {
                System.out.println(rooms.get(i).getMinPath().getId());
            }
        }else{
            System.out.println("No");
        }

    }
}

class Room {
    public int getId() {
        return id;
    }

    int id;

    public ArrayList<Room> getNext() {
        return next;
    }

    ArrayList<Room> next = new ArrayList<>();

    public Room getMinPath() {
        return minPath;
    }

    public void setMinPath(Room minPath) {
        this.minPath = minPath;
    }

    Room minPath=null;

    public int getMinStep() {
        return minStep;
    }

    public void setMinStep(int minStep) {
        this.minStep = minStep;
    }

    int minStep = 1000000000;

    public Room(int id) {
        this.id = id;
    }

    void connect(Room room) {
        next.add(room);
    }
}
