import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    boolean[] colorUnder3200 = new boolean[9];
    int rate = 0;
    int numOver3200 = 0;
    boolean allOver3200 = true;
    String[] data = br.readLine().split(" ");
    for(String score: data){
      rate = Integer.parseInt(score)/400;
      if(rate<8) {
        colorUnder3200[rate] = true;
        allOver3200 = false;
      } else {
        numOver3200++;
      }
    }
    int base = 0;
    for(boolean b: colorUnder3200){
      if(b) base++;
    }
    int max = base + numOver3200;
    int min = base==0 ? 1 : base;
    System.out.println(min + " " + max);
  }
}
