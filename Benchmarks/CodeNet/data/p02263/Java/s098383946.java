import java.util.Scanner;
import java.util.ArrayDeque;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    ArrayDeque<Integer> temp = new ArrayDeque<>();
    ArrayDeque<Integer> main = new ArrayDeque<>();

    while(scan.hasNext()) {
      String inputString = scan.next();
      char[] input = inputString.toCharArray();
      if(input[0]>='0'&&input[0]<='9') {
        temp.add(Integer.parseInt(inputString));
      }else {
        ArrayDeque<Integer> dum = main;
        if(temp.peek()!=null) {
          dum = temp;
        }
        int ans = dum.poll();
        while(dum.peek()!=null) {
          if(input[0]=='+') {
            ans += dum.poll();
          }else if(input[0]=='-') {
            ans -= dum.poll();
          }else {
            ans *= dum.poll();
          }
        }
        main.add(ans);
      }
    }
    System.out.println(main.poll());
  }
}