import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[][] roads = new int[3][2];
        for (int i=0; i<3; i++) {
            for (int j=0; j<2; j++) {
                roads[i][j] = scan.nextInt();
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(roads[0][0]);
        list.add(roads[0][1]);
        int rest = 0;
        outer:
        for (int i=1; i<3; i++) {
            for (int j=0; j<2; j++) {
                if (roads[i][j] == list.get(0)) {
                    if (j==0)
                        list.add(0, roads[i][1]);
                    else
                        list.add(0, roads[i][0]);
                    if (i==1) 
                        rest = 2;
                    else
                        rest = 1;
                    break outer;
                }
                if (roads[i][j] == list.get(1)) {
                    if (j==0)
                        list.add(roads[i][1]);
                    else
                        list.add(roads[i][0]);
                    if (i==1) 
                        rest = 2;
                    else
                        rest = 1;
                    break outer;
                }
            }
        }
        if (roads[rest][0]==list.get(0) || roads[rest][0]==list.get(2) || roads[rest][1]==list.get(0) || roads[rest][1]==list.get(2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
