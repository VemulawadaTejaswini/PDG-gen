import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x;
    int i = 0;

    while(true){
      x = sc.nextInt();
      if(i==10000 || x==0) break;
      System.out.printf("Case %d: %d\n", i+1, x);
      i++;
    }

    //for(int j=0; j<i; j++) System.out.printf("Case %d: %d\n", j+1, num[j]);
  }
}

