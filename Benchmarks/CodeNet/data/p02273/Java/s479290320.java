import java.io.*;

class Main {
    static int n;
    static StringBuilder sb = new StringBuilder("");

    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        
        drawKoch(0, 0, 100, 0, 1);

        sb.append(100.0).append(" ").append(0.0).append("\n");

        System.out.print(sb.toString());
    }

    public static void drawKoch(double p1x, double p1y, double p2x, double p2y, int count) {
        if (count == n + 1) {
            sb.append(p1x).append(" ").append(p1y).append("\n");
            return;
        }

        double sx = (p2x - p1x) / 3 + p1x;
        double sy = (p2y - p1y) / 3 + p1y;
        double tx = p2x - (p2x - p1x) / 3;
        double ty = p2y - (p2y - p1y) / 3;

        double ux = ((tx - sx) - Math.sqrt(3) * (ty - sy)) / 2 + sx;
        double uy = ((ty - sy) + Math.sqrt(3) * (tx - sx)) / 2 + sy;

        count++;
        drawKoch(p1x, p1y, sx, sy, count);
        drawKoch(sx, sy, ux, uy, count);
        drawKoch(ux, uy, tx, ty, count);
        drawKoch(tx, ty, p2x, p2y, count);
    }
}