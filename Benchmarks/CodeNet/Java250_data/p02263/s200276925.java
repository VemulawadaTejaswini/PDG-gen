// ALDS 1_3_A Stack
import java.io.*;


class Main {

   static int[] S = new int[1000];
   static int top = 0;

   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      try {
         int x;
         int a, b;
         String[] in = br.readLine().split(" ");
         for (int i = 0; i < in.length; i++) {
            if (in[i].equals("+")) {
               a = pop();
               b = pop();
               push(a + b);
            } else if (in[i].equals("-")) {
               b = pop();
               a = pop();
               push(a - b);
            } else if (in[i].equals("*")) {
               a = pop();
               b = pop();
               push(a * b);
            } else {
               x = Integer.parseInt(in[i]);
               push(x);
            }
         }
         System.out.println(pop());
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }
   static void push(int x) {
      top++;
      S[top] = x;
   }
   static int pop() {
      top--;
      return S[top + 1];
   }
}