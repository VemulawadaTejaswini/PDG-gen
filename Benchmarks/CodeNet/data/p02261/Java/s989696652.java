import java.util.Scanner;

public class Main {

  public static String[] bubble_sort(String[] a) {
    for (int i = 0; i < a.length; i++) {
      for (int j = a.length - 1; j >= i+1; j--) {

        int j_val = Integer.parseInt(a[j].substring(1));
        int j_minus_val = Integer.parseInt(a[j-1].substring(1));

        if (j_val < j_minus_val) {
          String tmp = a[j];
          a[j] = a[j-1];
          a[j-1] = tmp;
        }

      }
    }

    display_cards(a);
    display_stability(true);

    return a;
  }

  public static String[] selection_sort(String[] a) {
    boolean stable = true;
    for (int i = 0; i < a.length; i++) {
      int mini = i;

      int i_val = Integer.parseInt(a[i].substring(1));

      int same_value_seen_at = a.length;
      for (int j = i; j < a.length; j++) {

        int j_val = Integer.parseInt(a[j].substring(1));
        int mini_val = Integer.parseInt(a[mini].substring(1));

        if (j > i && j_val == mini_val)
          same_value_seen_at = j;

        if (j_val < mini_val)
          mini = j;
      }
      if (mini > same_value_seen_at)
        stable = false;
      String tmp = a[i];
      a[i] = a[mini];
      a[mini] = tmp;
    }

    display_cards(a);
    display_stability(stable);

    return a;
  }

  public static void display_cards(String[] a) {
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
      if (i != a.length - 1)
        System.out.print(" ");
      else
        System.out.print("\n");
    }
  }

  public static void display_stability(boolean stable) {
    if (stable)
      System.out.println("Stable");
    else
      System.out.println("Not Stable");
  }


  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    String[] a = new String[n];
    for (int i = 0; i < n; i++)
      a[i] = s.next();
    s.close();
    String[] b = a.clone();

    String[] bubble_sorted = bubble_sort(a);
    String[] selection_sorted = selection_sort(b);
  }
}

