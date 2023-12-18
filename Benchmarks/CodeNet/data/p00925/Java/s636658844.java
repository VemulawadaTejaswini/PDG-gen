public class Main{
  static int top;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int ba, i, tmp;
    String str;
    char[] ch;
    int[] la, ta;

    str = sc.next();
    ch = new char[str.length()];
    la = new int[10]; ta = new int[10];
    for(i = 0;i < str.length();i++)ch[i] = str.charAt(i);
    ba = sc.nextInt();

    top = 0;
    for(i = 0;i < str.length();i++){
      if(ch[i] >= '0' && ch[i] <= '9'){
        push(la, (int)(ch[i] - '0'));
      }else if(ch[i] == '+'){
        tmp = pop(la);
        push(la, tmp + (int)(ch[++i] - '0'));
      }else{
        tmp = pop(la);
        push(la, tmp * (int)(ch[++i] - '0'));
      }
    }

    top = 0;
    for(i = 0;i < str.length();i++){
      if(ch[i] >= '0' && ch[i] <= '9'){
        push(ta, (int)(ch[i] - '0'));
      }else if(ch[i] == '+'){
        i++;
        push(ta, (int)(ch[i] - '0'));
      }else{
        tmp = pop(ta);
        push(ta, tmp * (int)(ch[++i] - '0'));
      }
    }

    tmp = 0;
    for(i = 0;i < top;i++)tmp += ta[i];

    if(ba == la[0] && ba == tmp)out.println("U");
    else if(ba != la[0] && ba != tmp)out.println("I");
    else if(ba == la[0] && ba != tmp)out.println("L");
    else if(ba != la[0] && ba == tmp)out.println("M");

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