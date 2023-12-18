import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int P[] = new int[N];
    int a,b,x;
    String[] str;

    for(int i=0;i<M;i++){
      P[i] = i + 1;
    }

    for(int i=0;i<M;i++){
      str = scanner.next().split(",");
  		a = Integer.parseInt(str[0]);
  		b = Integer.parseInt(str[1]);
      x = P[a-1];
      P[a-1] = P[b-1];
      P[b-1] = x;
    }

    for(int i=0;i<M;i++){
      System.out.println(P[i]);
    }

  }
}

