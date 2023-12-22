import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Comparator<Point> comp = (p1, p2) -> p1.x - p2.x;
        List<Point> red = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            String[] in = br.readLine().split(" ");
            red.add(new Point(Integer.parseInt(in[0]), Integer.parseInt(in[1])));
        }
        Collections.sort(red, comp);
        PriorityQueue<Point> blue = new PriorityQueue<>(comp);
        for(int i = 0; i < n; i++) {
            String[] in = br.readLine().split(" ");
            blue.add(new Point(Integer.parseInt(in[0]), Integer.parseInt(in[1])));
        }

        int ans = 0;
        while(!blue.isEmpty()) {
            Point b = blue.poll();
            
            int index = -1;
            int maxy = -1;
            int i = 0;
            Point tmp;
            while(i < red.size() && (tmp = red.get(i)).x < b.x) {
                if(tmp.y < b.y && maxy < tmp.y) {
                    index = i;
                    maxy = tmp.y;
                }
                i++;
            }

            if(index != -1) {
                red.remove(index);
                ans++;
            }
        }

        System.out.println(ans);

        br.close();
    }
}