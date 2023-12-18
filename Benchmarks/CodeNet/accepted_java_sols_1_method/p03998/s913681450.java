import java.util.*;

class Main{
    public static void main(String[] arg){
      Scanner sc = new Scanner(System.in);
      String A = sc.nextLine();
      String B = sc.nextLine();
      String C = sc.nextLine();
      char[] listA = A.toCharArray();
      char[] listB = B.toCharArray();
      char[] listC = C.toCharArray();
      int a = 0;int b = 0;int c = 0;
      char now = listA[0];
      a = 1;
      while(true){
        switch(now){
          case 'a':
            if(a == listA.length){
              System.out.println("A");
              System.exit(0);
            }
            now = listA[a];
            a++;
            break;
          case 'b':
            if(b == listB.length){
              System.out.println("B");
              System.exit(0);
            }
            now = listB[b];
            b++;
            break;
          case 'c':
            if(c == listC.length){
              System.out.println("C");
              System.exit(0);
            }
            now = listC[c];
            c++;
            break;
        }
      }

    }
}
