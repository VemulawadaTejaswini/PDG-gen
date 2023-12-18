import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    scan.nextLine(); // N と Q の行読み飛ばし
    String str = scan.nextLine();
    String[] array = str.split(" ");
//    List<String> list = Arrays.asList(array);
    int[] dupli = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      int j;
      for (j = i+1; j < array.length; j++) {
//        System.out.println("i: " + array[i] + ", j: " + array[j]);
        if (array[i].equals(array[j])){
          dupli[i] = j+1;
          break;
        }
      }
      if(j==array.length) dupli[i] = -1;
    }
//    for(int i : dupli) {
//      System.out.println(i);
//    }

    while (scan.hasNext()) {
      str = scan.nextLine();
      String[] strs = str.split(" ");
      int l = Integer.parseInt(strs[0]);
      int r = Integer.parseInt(strs[1]);
      int count = 0;
      for (int i = l-1; i < r; i++) {
        if(dupli[i] > r || dupli[i] == -1) count++;
      }
      System.out.println(count);

//      List<String> sbList = list.subList(l-1, r);
//      System.out.println(new HashSet<>(sbList).size());
    }
  }
}
