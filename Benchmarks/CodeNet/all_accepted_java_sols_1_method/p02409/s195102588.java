import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> building1floor1 = new ArrayList<>();
        ArrayList<Integer> building1floor2 = new ArrayList<>();
        ArrayList<Integer> building1floor3 = new ArrayList<>();
        ArrayList<Integer> building2floor1 = new ArrayList<>();
        ArrayList<Integer> building2floor2 = new ArrayList<>();
        ArrayList<Integer> building2floor3 = new ArrayList<>();
        ArrayList<Integer> building3floor1 = new ArrayList<>();
        ArrayList<Integer> building3floor2 = new ArrayList<>();
        ArrayList<Integer> building3floor3 = new ArrayList<>();
        ArrayList<Integer> building4floor1 = new ArrayList<>();
        ArrayList<Integer> building4floor2 = new ArrayList<>();
        ArrayList<Integer> building4floor3 = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            building1floor1.add(0);
            building1floor2.add(0);
            building1floor3.add(0);

            building2floor1.add(0);
            building2floor2.add(0);
            building2floor3.add(0);

            building3floor1.add(0);
            building3floor2.add(0);
            building3floor3.add(0);

            building4floor1.add(0);
            building4floor2.add(0);
            building4floor3.add(0);
        }

        Scanner inp = new Scanner(System.in);
        int total = inp.nextInt();

        for (int k = 0; k < total; k++) {
            int b = inp.nextInt();
            int f = inp.nextInt();
            int r = inp.nextInt();
            int v = inp.nextInt();

            switch(b){
                case(1):
                    switch(f){
                        case(1): int a = building1floor1.get(r-1);
                            building1floor1.set(r-1,  a + v);
                            break;
                        case(2): int c = building1floor2.get(r-1);
                            building1floor2.set(r-1, c + v);
                            break;
                        case(3): int d = building1floor3.get(r-1);
                            building1floor3.set(r-1, d + v);
                            break;
                    }
                    break;
                case(2): switch(f){
                    case(1): int e = building2floor1.get(r-1);
                        building2floor1.set(r-1, e + v);
                        break;
                    case(2): int g = building2floor2.get(r-1);
                        building2floor2.set(r-1, g + v);
                        break;
                    case(3): int h = building2floor3.get(r-1);
                        building2floor3.set(r-1, h + v);
                        break;
                }
                    break;
                case(3): switch(f){
                    case(1):int i =  building3floor1.get(r-1);
                        building3floor1.set(r-1, i + v);
                        break;
                    case(2): int j = building3floor2.get(r-1);
                        building3floor2.set(r-1, j + v);
                        break;
                    case(3): int l = building3floor3.get(r-1);
                        building3floor3.set(r-1, l + v);
                        break;
                }
                    break;
                case(4): switch(f){
                    case(1): int m = building4floor1.get(r-1);
                        building4floor1.set(r-1, m + v);
                        break;
                    case(2): int n = building4floor2.get(r-1);
                        building4floor2.set(r-1, n + v);
                        break;
                    case(3): int o = building4floor3.get(r-1);
                        building4floor3.set(r-1, o + v);
                        break;
                }
                    break;
            }
        }

        for (int item = 0; item < 10; item++) {
            System.out.print(" " + building1floor1.get(item));
        }
        System.out.print("\n");
        for (int item = 0; item < 10; item++) {
            System.out.print(" " + building1floor2.get(item));
        }
        System.out.print("\n");
        for (int item = 0; item < 10; item++) {
            System.out.print(" " + building1floor3.get(item));
        }
        System.out.print("\n");
        System.out.println("####################");

        for (int item = 0; item < 10; item++) {
            System.out.print(" " + building2floor1.get(item));
        }
        System.out.print("\n");
        for (int item = 0; item < 10; item++) {
            System.out.print(" " + building2floor2.get(item));
        }
        System.out.print("\n");
        for (int item = 0; item < 10; item++) {
            System.out.print(" " + building2floor3.get(item));
        }
        System.out.print("\n");
        System.out.println("####################");

        for (int item = 0; item < 10; item++) {
            System.out.print(" " + building3floor1.get(item));
        }
        System.out.print("\n");
        for (int item = 0; item < 10; item++) {
            System.out.print(" " + building3floor2.get(item));
        }
        System.out.print("\n");
        for (int item = 0; item < 10; item++) {
            System.out.print(" " + building3floor3.get(item));
        }
        System.out.print("\n");
        System.out.println("####################");

        for (int item = 0; item < 10; item++) {
            System.out.print(" " + building4floor1.get(item));
        }
        System.out.print("\n");
        for (int item = 0; item < 10; item++) {
            System.out.print(" " + building4floor2.get(item));
        }
        System.out.print("\n");
        for (int item = 0; item < 10; item++) {
            System.out.print(" " + building4floor3.get(item));
        }

        System.out.print("\n");
    }
}

