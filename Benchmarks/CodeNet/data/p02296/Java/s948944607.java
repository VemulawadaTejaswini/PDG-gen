import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int q;
    private static ArrayList<Integer> xp0 = new ArrayList<>();
    private static ArrayList<Integer> yp0 = new ArrayList<>();
    private static ArrayList<Integer> xp1 = new ArrayList<>();
    private static ArrayList<Integer> yp1 = new ArrayList<>();
    private static ArrayList<Integer> xp2 = new ArrayList<>();
    private static ArrayList<Integer> yp2 = new ArrayList<>();
    private static ArrayList<Integer> xp3 = new ArrayList<>();
    private static ArrayList<Integer> yp3 = new ArrayList<>();

    public static void main(String... aug) {
        input();
        result();
    }

    private static void result() {
        int tc, td;

        for (int i = 0; i < q; ++i) {
            tc = (xp0.get(i) - xp1.get(i)) * (yp2.get(i) - yp0.get(i)) + (yp0.get(i) - yp1.get(i)) * (xp0.get(i) - xp2.get(i));
            td = (xp0.get(i) - xp1.get(i)) * (yp3.get(i) - yp0.get(i)) + (yp0.get(i) - yp1.get(i)) * (xp0.get(i) - xp3.get(i));

            if (tc * td < 0) { //????????????
                System.out.println((double)0);
            } else { //???????????????
                List<Double> list = new ArrayList<>();
                double dis = 0;

                dis = distanceDotLine(xp0.get(i), yp0.get(i), xp2.get(i), yp2.get(i), xp3.get(i), yp3.get(i));
                if (dis != -1) {list.add(dis);} else {list.add(
                        Math.min(Math.sqrt((xp0.get(i) - xp2.get(i)) * (xp0.get(i) - xp2.get(i)) +(yp0.get(i) - yp2.get(i)) * (yp0.get(i) - yp2.get(i))),
                                Math.sqrt((xp0.get(i) - xp3.get(i)) * (xp0.get(i) - xp3.get(i)) +(yp0.get(i) - yp3.get(i)) * (yp0.get(i) - yp3.get(i)))
                                )
                );}

                dis = distanceDotLine(xp1.get(i), yp1.get(i), xp2.get(i), yp2.get(i), xp3.get(i), yp3.get(i));
                if (dis != -1) {list.add(dis);} else {list.add(
                        Math.min(Math.sqrt((xp1.get(i) - xp2.get(i)) * (xp1.get(i) - xp2.get(i)) +(yp1.get(i) - yp2.get(i)) * (yp1.get(i) - yp2.get(i))),
                                Math.sqrt((xp1.get(i) - xp3.get(i)) * (xp1.get(i) - xp3.get(i)) +(yp1.get(i) - yp3.get(i)) * (yp1.get(i) - yp3.get(i)))
                        )
                );}

                dis = distanceDotLine(xp2.get(i), yp2.get(i), xp0.get(i), yp0.get(i), xp1.get(i), yp1.get(i));
                if (dis != -1) {list.add(dis);} else {list.add(
                        Math.min(Math.sqrt((xp2.get(i) - xp0.get(i)) * (xp2.get(i) - xp0.get(i)) +(yp2.get(i) - yp0.get(i)) * (yp2.get(i) - yp0.get(i))),
                                Math.sqrt((xp2.get(i) - xp1.get(i)) * (xp2.get(i) - xp1.get(i)) +(yp2.get(i) - yp1.get(i)) * (yp2.get(i) - yp1.get(i)))
                        )
                );}

                dis = distanceDotLine(xp3.get(i), yp3.get(i), xp0.get(i), yp0.get(i), xp1.get(i), yp1.get(i));
                if (dis != -1) {list.add(dis);} else {list.add(
                        Math.min(Math.sqrt((xp3.get(i) - xp0.get(i)) * (xp3.get(i) - xp0.get(i)) +(yp3.get(i) - yp0.get(i)) * (yp3.get(i) - yp0.get(i))),
                                Math.sqrt((xp3.get(i) - xp1.get(i)) * (xp3.get(i) - xp1.get(i)) +(yp3.get(i) - yp1.get(i)) * (yp3.get(i) - yp1.get(i)))
                        )
                );}

                double result = list.get(0);

                for (double get : list) {
                    if (result > get) result = get;
                }

                System.out.println(result);
            }
        }
    }

    private static double distanceDotLine(int px, int py, int ax, int ay, int bx, int by) {
        double disA = (ax - bx) * (ax - bx) + (ay - by) * (ay - by);
        double disB = (px - ax) * (px - ax) + (py - ay) * (py - ay);
        double vecAx = bx - ax, vecAy = by - ay;
        double vecBx = px - ax, vecBy = py - ay;
        double inner =vecAx * vecBx + vecAy * vecBy;

        if (inner >= 0 && inner <= disA) {
            return Math.sqrt(disB) * Math.sqrt(1 - (inner * inner / (disA * disB)));
        } else {
            return -1;
        }
    }

    private static void input() {
        Scanner in = new Scanner(System.in);

        q = Integer.parseInt(in.next());

        for (int i = 0; i < q; ++i) {
            xp0.add(Integer.parseInt(in.next()));
            yp0.add(Integer.parseInt(in.next()));
            xp1.add(Integer.parseInt(in.next()));
            yp1.add(Integer.parseInt(in.next()));
            xp2.add(Integer.parseInt(in.next()));
            yp2.add(Integer.parseInt(in.next()));
            xp3.add(Integer.parseInt(in.next()));
            yp3.add(Integer.parseInt(in.next()));
        }

        return;
    }

}