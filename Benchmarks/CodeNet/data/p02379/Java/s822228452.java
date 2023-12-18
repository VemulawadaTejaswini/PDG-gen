import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] points = br.readLine().split(" ");
        double x1 = Double.parseDouble(points[0]);
        double y1 = Double.parseDouble(points[1]);
        double x2 = Double.parseDouble(points[2]);
        double y2 = Double.parseDouble(points[3]);
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(distance);
    }
}