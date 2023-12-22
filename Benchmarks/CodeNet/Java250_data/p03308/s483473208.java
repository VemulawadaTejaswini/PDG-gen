import java.util.*; // headers MUST be above the first class

public class Main
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
	int a[] = new int[n];
	int min = sc.nextInt(), max = min;
    for (int i=1; i<n; i++) {
      a[i] = sc.nextInt();
      if (a[i] < min) min = a[i];
      if (a[i] > max) max = a[i];
    }
    System.out.println(max - min);
  }
}
