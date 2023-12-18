//import java.io.File;
import java.util.Scanner;
import java.util.Stack;

class Main{
  public static void main(String[] args) throws Exception{
    //Scanner scan = new Scanner(new File("in.txt"));
    Scanner scan = new Scanner(System.in);
    //MyScanner scan = new MyScanner();

    int input1 = scan.nextInt();
    Stack<Integer> st = new Stack<>();
    int stc = 1;
    int answer = 0;

    st.push(scan.nextInt());

    for(int incount = 0; incount < input1-1; incount++) {
      int input2 = scan.nextInt();
      boolean flag = true;

      while(st.peek() > input2) {
        st.pop();
        answer++;
        stc--;
      }
      if(st.peek() < input2) {
        st.push(input2);
        stc++;
      }

      /*
      for(int j = 0; j < ite; j++) {
        System.out.print(arr[j]+",");
      }
      System.out.println(" answer -> "+answer);
      */
    }
    System.out.println(answer+stc);
  }
}