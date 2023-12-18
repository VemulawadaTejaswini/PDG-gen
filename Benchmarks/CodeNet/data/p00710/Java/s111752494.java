//import java.io.File;
import java.util.Scanner;
import java.util.LinkedList;

public class Main{
  public static void main(String[] args) {
try{
    //Scanner scan = new Scanner(new File("in.txt"));
    Scanner scan = new Scanner(System.in);

    int input1 = scan.nextInt();
    int input2 = scan.nextInt();

    while(input1!=0&&input2!=0) {
      LinkedList<Integer> ll = new LinkedList<>();

      for(int i = input1; i > 0; i--) {
        ll.add(i);
      }

      for(int j = 0; j < input2; j++) {
        /*
            for(int _s : ll) {
              System.out.println(_s);
            }
            System.out.println("end");
            */
        LinkedList<Integer> dummy = new LinkedList<>();

        int input3 = scan.nextInt()-1;
        int input4 = scan.nextInt();

        for(int i = 0; i < input4; i++) {
          dummy.add(ll.get(input3));
          ll.remove(input3);
        }

        ll.addAll(0,dummy);
      }

/*
      for(int _s : ll) {
        System.out.println(_s);
      }
      System.out.println("end000000000000");
      */
      System.out.println(ll.get(0));

      input1 = scan.nextInt();
      input2 = scan.nextInt();
    }
}catch(Exception e) {
  e.printStackTrace();
}
  }
}