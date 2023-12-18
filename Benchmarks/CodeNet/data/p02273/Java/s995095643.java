import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class Main{
    private static final DecimalFormat fmt = new DecimalFormat("0.########");
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        sb.append("0 0\n");
        koch(0, 0, 100, 0, n);
        sb.append("100 0\n");
        System.out.print(sb);
    }
    private static void koch(double x0, double y0, double x1, double y1, int n){
        if(n==0) return;
        n--;
        final double sx = (x0+x0+x1)/3;
        final double sy = (y0+y0+y1)/3;
        final double ux = (x0+x1)/2-(y1-y0)*Math.sqrt(3)/6;
        final double uy = (y0+y1)/2+(x1-x0)*Math.sqrt(3)/6;
        final double tx = (x0+x1+x1)/3;
        final double ty = (y0+y1+y1)/3;
        koch(x0, y0, sx, sy, n);
        sb.append(fmt.format(sx)).append(' ').append(fmt.format(sy)).append('\n');
        koch(sx, sy, ux, uy, n);
        sb.append(fmt.format(ux)).append(' ').append(fmt.format(uy)).append('\n');
        koch(ux, uy, tx, ty, n);
        sb.append(fmt.format(tx)).append(' ').append(fmt.format(ty)).append('\n');
        koch(tx, ty, x1, y1, n);
    }
}