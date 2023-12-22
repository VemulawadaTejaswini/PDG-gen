import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int s = sc.nextInt();
      int m=0,h=0;
      while(s>=60){
        s = s - 60;
        m++;
        while(m>=60){
          m = m - 60;
          h++;
        }
      }
      System.out.println(h+":"+m+":"+s);
    }
}

