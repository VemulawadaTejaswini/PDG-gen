public class Main {
 private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1);

 public static void main(String args[]) {
  new Main().start();
 }

 public void start() {
  int num = Integer.parseInt(reader.readLine());
  num = Math.pow(num, 3);
  System.out.println(num);
 }

}