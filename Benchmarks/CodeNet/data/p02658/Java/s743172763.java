import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
	double mul[] = new double[num];
	for (int i = 0; i < num; i++) {
      mul[i] = sc.nextInt();
    }
    double ans = 1;
    for (int j = 0; j < num; j++) {
      ans = ans * mul[j];
    }
    
    double b = Math.pow(10,18);
    if (ans <= b) {
      String ansStr = Double.toString(ans);
      int k = ansStr.length();
      System.out.println(ansStr.substring(0,k-2));
    }                         
}
}