import java.io.*;
import java.util.ArrayList;

public class Main {
    private static ArrayList<House> houses = new ArrayList<>();

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int n,m;
            String[] temp = in.readLine().split(" ");
            n = Integer.parseInt(temp[0]);
            m = Integer.parseInt(temp[1]);
            for (int i = 0;i < n;i ++) {
                houses.add(new House(i+1));
            }
            for(int i = 0;i < m;i ++) {
                temp = in.readLine().split(" ");
                houses.get(Integer.parseInt(temp[0]) - 1).connectedHouse
                        .add(houses.get(Integer.parseInt(temp[1]) - 1));
                houses.get(Integer.parseInt(temp[1]) - 1).connectedHouse
                        .add(houses.get(Integer.parseInt(temp[0]) - 1));
            }
            ArrayList<House> a = new ArrayList<>();
            ArrayList<House> b = new ArrayList<>();
            ArrayList<House> c;
            a.add(houses.get(0));
            while(true) {
                c = b;
                b = a;
                a = c;
                a.clear();
                for(House house : b) {
                    for(House house1 : house.connectedHouse) {
                        if (house1.lastHouse == null) {
                            house1.lastHouse = house;
                            a.add(house1);
                        }
                    }
                }
                if(a.isEmpty()) break;
            }
            houses.remove(0);
            boolean isDone = true;
            for(House house : houses) {
                if (house.lastHouse == null) {
                    isDone = false;
                }
            }
            if(isDone) {
                System.out.println("Yes");
                for(int i = 0;i < houses.size();i ++) {
                    if(i < houses.size() - 1) {
                        System.out.println(houses.get(i).lastHouse.num);
                    } else {
                        System.out.print(houses.get(i).lastHouse.num);
                    }
                }
            } else {
                System.out.print("No");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class House {
    House lastHouse;
    ArrayList<House> connectedHouse = new ArrayList<>();
    int num;
    public House(int num) {
        this.num = num;
    }
}
