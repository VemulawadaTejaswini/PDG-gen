import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str1 = br.readLine();
    String[] str2 = str1.split(" ");
    double x1, y1, x2, y2;
    double distance;
    x1 = Double.parseDouble(str2[0]);
    y1 = Double.parseDouble(str2[1]);
    x2 = Double.parseDouble(str2[2]);
    y2 = Double.parseDouble(str2[3]);
    distance = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    System.out.println(distance);
  }
}
