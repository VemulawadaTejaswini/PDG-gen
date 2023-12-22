import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        array.add(sc.nextInt());
        array.add(sc.nextInt());

        if(!array.contains(1))
          System.out.println(1);
        else if(!array.contains(2))
          System.out.println(2);
        else
          System.out.println(3);
    }
}