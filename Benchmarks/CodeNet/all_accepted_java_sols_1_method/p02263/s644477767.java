import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int j = 0;
    int a, b;

    String input = sc.nextLine();
    //System.out.println(input);

    String[] s = input.split(" ",0);
    int len = s.length;

    int[] stack = new int[len];

    for (int i = 0; i < len; i++) {
      if(s[i].equals("+")){
        a = stack[j-2];
        b = stack[j-1];
        stack[j-2] = a+b;
        j = j-1;
      }
      else if(s[i].equals("-")){
        a = stack[j-2];
        b = stack[j-1];
        stack[j-2] = a-b;
        j = j-1;
      }
      else if(s[i].equals("*")){
        a = stack[j-2];
        b = stack[j-1];
        stack[j-2] = a*b;
        j = j-1;
      }
      else{
        a = Integer.parseInt(s[i]);
        stack[j] = a;
        j=j+1;
      }
    }
    System.out.println(stack[0]);
  }
}
