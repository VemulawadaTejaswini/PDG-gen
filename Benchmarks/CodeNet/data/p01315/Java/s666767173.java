import java.util.*;

public class Main {
    private static final String END_OF_DATASET = "#";

    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int n;
            while((n = scn.nextInt()) > 0) {
                ArrayList<Plant> plants = new ArrayList<>();
                while(n-- > 0) {
                    String name    = scn.next();
                    int cost       = scn.nextInt();
                    int firstTime  = scn.nextInt() + scn.nextInt();
                    int latterTime = scn.nextInt() + scn.nextInt() + scn.nextInt();
                    int amount     = scn.nextInt();
                    int price      = scn.nextInt();
                    int count      = scn.nextInt();

                    double profit     = amount * price * count - cost;
                    double efficiency = profit / (firstTime + latterTime * count);

                    plants.add(new Plant(name, efficiency));
                }

                Collections.sort(plants);
                for(Plant plant : plants) {
                    System.out.println(plant);
                }
                System.out.println(END_OF_DATASET);
            }
        }
    }
}

class Plant implements Comparable<Plant> {
    private String name;
    private double efficiency;

    public Plant(String name, double efficiency) {
        this.name       = name;
        this.efficiency = efficiency;
    }

    public int compareTo(Plant another) {
        int rslt;
        if(this.efficiency < another.efficiency) {
            rslt = 1;
        } else if(this.efficiency > another.efficiency) {
            rslt = -1;
        } else {
            rslt = this.name.compareTo(another.name);
        }
        return rslt;
    }

    @Override
    public String toString() {
        return name;
    }
}