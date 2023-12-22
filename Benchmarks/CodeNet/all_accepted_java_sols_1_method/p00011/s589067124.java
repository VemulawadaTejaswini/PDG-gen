import java.util.Scanner;

public class Main{

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  int x = sc.nextInt();

  int y = sc.nextInt();

  int[] values = new int[x];

  for (int i = 0; i < values.length; i++) {

   values[i] = i +1;

  }
  for (int i = 0; i < y; i++) {
   String str = sc.next();
   String[] ab = str.split(",");
   int a = Integer.parseInt(ab[0])-1;
   int b = Integer.parseInt(ab[1])-1;
   int t = values[a];
   values[a] = values[b];
   values[b] = t;
  }
  for (int j=0; j < x; j++) {
   System.out.println(values[j]);
  }
 }
}