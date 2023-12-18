import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int[] a = new int[10000];
    int[]  b = new int[10000];
    char[] op = new char[10000];

    int i = 0; // counter

    for(;;){
      a[i] = input.nextInt();
      op[i] = input.next().charAt(0);
      b[i] = input.nextInt();
      if(op[i] == '?') break;
      i++;
    }

    // i - 1????????????????????????
    for (int j = 0; j < i ; j++){
      if (op[j] == '+')
        System.out.println(a[j] + b[j]);
      else if (op[j] == '-')
        System.out.println(a[j] - b[j]);
      else if (op[j] == '*')
        System.out.println(a[j] * b[j]);
      else if (op[j] == '/')
        System.out.println(a[j] / b[j]);
    }

  }
}