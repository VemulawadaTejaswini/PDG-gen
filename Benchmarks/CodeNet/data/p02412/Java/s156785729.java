import java.util.Scanner;
 
class Main{
  public static void main(String[] arg){
    int n, x;

    Scanner in = new Scanner(System.in);

    while(true){
        n = in.nextInt();
        x = in.nextInt();
        
        if(n == 0 && x == 0) break;

        int cnt = 0;
        
        for(int first = 1; first <= n-(1+2); first++){
            for(int second = first+1; second <= n-(first+1); second++){
                int third = x - (first+second);
                if(third>0 &&
                    third != first &&
                    third != second)
                    cnt++;
            }
        }

        System.out.println(cnt);
    }

  }
}