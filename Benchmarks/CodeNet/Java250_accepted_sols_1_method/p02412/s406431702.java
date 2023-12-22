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
        
        for(int first = n; first > 0; first--){
            for(int second = 1; second < first; second++){
                int third = x - (first+second);
                if( first != second &&
                    third > 0 &&
                    third <= n &&
                    third != first &&
                    third != second){
                    // debug System.out.println("first = " + first + " second = " + second + " third = " + third);
                    cnt++;
                }
                    
            }
        }

        System.out.println(cnt/3);
    }

  }
}