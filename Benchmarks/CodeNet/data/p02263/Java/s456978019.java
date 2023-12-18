public class Main{
  static int top = 0;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int[] stack;
    String prec;
    char c;

    stack = new int[200];
    top = 0;

    for(;;){
      if(!sc.hasNext())break;
      prec = sc.next();
      c = prec.charAt(0);
      if('0' <= c && c <= '9'){
        push(stack, Integer.parseInt(prec));
      }else if(c == '+'){
        push(stack, pop(stack) + pop(stack));
      }else if(c == '-'){
        push(stack,  -pop(stack) + pop(stack));
      }else if(c == '*'){
        push(stack, pop(stack) * pop(stack));
      }else{
        break;
      }
    }

    System.out.println(pop(stack));

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static int pop(int[] stack){
    return stack[--top];
  }

  private static void push(int[] stack, int a){
    stack[top++] = a;
    return;
  }
}