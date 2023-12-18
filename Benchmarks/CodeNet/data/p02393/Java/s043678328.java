import java.util.*;

class Main {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  List<Integer> num = new ArrayList<>();
  for (int i=0; i<3; i++) {
   num.add(Integer.parseInt(sc.next()));
  }
  sc.close();

  num.sort(null);

  System.out.println(num.get(0) + " " + num.get(1) + " " + num.get(2));
 }
}
