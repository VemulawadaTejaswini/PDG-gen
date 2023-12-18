import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n = Integer.parseInt(br.readLine());
for (int i = 0; i < n; i++) {
String line = br.readLine();
String[] values = line.split(" ");
double x1 = Double.parseDouble(values[0]);
double y1 = Double.parseDouble(values[1]);
double x2 = Double.parseDouble(values[2]);
double y2 = Double.parseDouble(values[3]);
double x3 = Double.parseDouble(values[4]);
double y3 = Double.parseDouble(values[5]);
double x4 = Double.parseDouble(values[6]);
double y4 = Double.parseDouble(values[7]);
System.out.println((x2 - x1) * (y4 - y3) == (y2 - y1) * (x4 - x3) ? "YES" : "NO");
}
}
}