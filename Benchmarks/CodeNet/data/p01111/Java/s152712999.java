import java.util.Scanner;

public class Main {
 static int Search(long low, long high, long b) {
 
  long mid = 0;
  while (low < high) {
   mid = (low + high) / 2;
   long ans = mid * mid + mid;
   if (ans == b)
    return (int) mid;
   else if (ans < b)
    low = mid + 1;
   else
    high = mid;
  }
  return (int) mid;
 }

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  while (true) {
   long b = sc.nextLong();
   if (b == 0)
    break;
   b *= 2;
   int max = Search(1, (long) Math.sqrt(b) + 2, b);
   int size = 1;
   int a = 0;
   for (size = max; size > 0; size--) {
    if (b % size != 0)
     continue;
    else if ((b / size - size + 1) % 2 != 0)
     continue;
    a = (int) (b / size - size + 1) / 2;
    break;
   }
   System.out.println(a + " " + size);
  }
  sc.close();
 }
}
