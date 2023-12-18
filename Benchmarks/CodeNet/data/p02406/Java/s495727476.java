import java.util.Scanner;
 
class Main{
  public static void main(String[] arg){
    int n;

    Scanner in = new Scanner(System.in);

    n = in.nextInt();

    for(int i=1; i<=n; i++){
        int x = i;
        
        if(x%3 == 0){
            System.out.print(" " + i);
        }else{
            if(x/10 > 0){
                if(x%10 == 3){
                    System.out.print(" " + i);
                }
            }
        }
    }
    System.out.println();
  }
}