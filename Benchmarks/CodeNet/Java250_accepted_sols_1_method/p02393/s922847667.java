import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int w,y,z;
          if ( a > b ){
            w = a;
            a = b;
            b = w;
          }
          if ( b > c ){
            y = b;
            b = c;
            c = y;
          }
          if ( a > b ){
            z = a;
            a = b;
            b = z;
          }
        System.out.println(a + " " + b + " " + c);
        }
      }
