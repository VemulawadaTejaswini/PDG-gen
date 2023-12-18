import java.util.*;
class Main{
        public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
                int b = sc.nextInt();
        int c = sc.nextInt();

                int [] d = new int [3];
        d[0] = a;
        d[1] = b;
        d[2] = c;

        Arrays.sort(d);
        if((d[0] == 5 && d[1] == 5) && d[2] == 7)
          System.out.println("YES");
        else
          System.out.println("NO");

    }
}