import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            int n = Integer.parseInt(sc.nextLine().trim());
            if (n == 0) break;

            int[][] raps = new int[n][2];
            String[] rapStr;

            for (int i = 0; i < n; i++) {
                rapStr = sc.nextLine().split(" ");
                raps[i][0] = Integer.parseInt(String.join("", rapStr[0].split(":")));
                raps[i][1] = Integer.parseInt(String.join("", rapStr[1].split(":")));
            }

            ArrayList<ArrayList<int[]>> trains = new ArrayList<>();
            trains.add(new ArrayList<>());
            trains.get(0).add(raps[0]);
            for (int i = 1; i < raps.length; i++) {
                int[] rap = raps[i];
                boolean add = false;
                train: for (ArrayList<int[]> train: trains) {
                    ListIterator li = train.listIterator(train.size());
                    int ind = li.previousIndex();
                    int[] prev;
                    int[] last = new int[] {240000, 240000};
                    while (li.hasPrevious()) {
                        prev = (int[])li.previous();
//                        System.out.println(Arrays.toString(prev));
//                        System.out.println(Arrays.toString(last));
//                        System.out.println(Arrays.toString(rap));
                        if (prev[1] <= rap[0] && rap[1] <= last[0]) {
                            train.add(ind+1, rap);
//                            System.out.println(Arrays.deepToString(train.toArray()));
                            add = true;
                            break train;
                        } else if(!(prev[0] >= rap[1])) {
                            break;
                        }

                        last = prev;
                    }
                }
                // ??????????????´??????????????£??????
                if (!add) {
                    ArrayList<int[]> newList = new ArrayList<>();
                    newList.add(rap);
                    trains.add(newList);
                }
            }

//            System.out.println("Last trains:");
//            for (ArrayList l: trains) {
//                System.out.println(Arrays.deepToString(l.toArray()));
//            }

            System.out.println(trains.size());
        }
    }
}