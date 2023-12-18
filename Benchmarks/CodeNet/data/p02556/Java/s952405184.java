import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final long bill = 1000000000;
        long pos[][] = new long [n][n];
        long xMax = 0, xMin = bill;
        long yMax = 0, yMin = bill;

        //各点からx座標、y座標の最大値、最小値を求める
        for(int i = 0; i < n; i++){
            pos[i][0] = sc.nextInt();
            if(xMax < pos[i][0]){
                xMax = pos[i][0];
            }
            if(xMin > pos[i][0]){
                xMin = pos[i][0];
            }
            pos[i][1] = sc.nextInt();
            if(yMax < pos[i][1]){
                yMax = pos[i][1];
            }
            if(yMin > pos[i][1]){
                yMin = pos[i][1];
            }
        }
        //System.out.println("xMax=" + xMax + " xMin=" + xMin);
        //System.out.println("yMax=" + yMax + " yMin=" + yMin);
        //x座標最大の点のy座標、x座標最小の点のy座標
        //y座標最大の点のx座標、y座標最小の点のx座標を格納するリスト
        List<Long> x_yMax = new ArrayList<Long>();
        List<Long> x_yMin = new ArrayList<Long>();
        List<Long> y_xMax = new ArrayList<Long>();
        List<Long> y_xMin = new ArrayList<Long>();

        for(int i = 0; i < n; i++){
            if(pos[i][0] == xMax){
                y_xMax.add(pos[i][1]);
            }
            if(pos[i][0] == xMin){
                y_xMin.add(pos[i][1]);
            }
            if(pos[i][1] == yMax){
                x_yMax.add(pos[i][0]);
            }
            if(pos[i][1] == yMin){
                x_yMin.add(pos[i][0]);
            }
        }
        
        long a = Collections.max(x_yMax);
        long b = Collections.min(x_yMax);
        long c = Collections.max(x_yMin);
        long d = Collections.min(x_yMin);
        long e = Collections.max(y_xMax);
        long f = Collections.min(y_xMax);
        long g = Collections.max(y_xMin);
        long h = Collections.min(y_xMin);

        long x, y, dist, dist_x, dist_y, distMax = 0;
        for(int i = 0; i < n; i++){
            x = pos[i][0];
            y = pos[i][1];
            
            dist_x = atai(x - a);
            dist_y = atai(y - yMax);
            dist = dist_x + dist_y;
            if(distMax < dist){
                distMax = dist;
            }

            dist_x = atai(x - b);
            dist_y = atai(y - yMax);
            dist = dist_x + dist_y;
            if(distMax < dist){
                distMax = dist;
            }

            dist_x = atai(x - c);
            dist_y = atai(y - yMin);
            dist = dist_x + dist_y;
            if(distMax < dist){
                distMax = dist;
            }

            dist_x = atai(x - d);
            dist_y = atai(y - yMin);
            dist = dist_x + dist_y;
            if(distMax < dist){
                distMax = dist;
            }

            dist_x = atai(x - xMax);
            dist_y = atai(y - e);
            dist = dist_x + dist_y;
            if(distMax < dist){
                distMax = dist;
            }

            dist_x = atai(x - xMax);
            dist_y = atai(y - f);
            dist = dist_x + dist_y;
            if(distMax < dist){
                distMax = dist;
            }

            dist_x = atai(x - xMin);
            dist_y = atai(y - g);
            dist = dist_x + dist_y;
            if(distMax < dist){
                distMax = dist;
            }

            dist_x = atai(x - xMin);
            dist_y = atai(y - h);
            dist = dist_x + dist_y;
            if(distMax < dist){
                distMax = dist;
            }
        }
        System.out.println(distMax);
    }
    private static long atai(long v){
        if(v < 0){
            v *= -1;
        }
        return v;
    }
}
