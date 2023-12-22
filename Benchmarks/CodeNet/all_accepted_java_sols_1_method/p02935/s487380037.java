import java.util.*;

class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Float> values = new ArrayList<Float>();
    for (int i = 0; i < n; i++) {
      values.add((float)sc.nextInt());
    }

    while(values.size() > 1) {
      Collections.sort(values);
      float i = values.get(0);
      float j = values.get(1);
      values.remove(0);
      values.remove(0);
      float k = (i+j)/2;
      values.add(k);
    }

    System.out.println(values.get(0));
  }
}