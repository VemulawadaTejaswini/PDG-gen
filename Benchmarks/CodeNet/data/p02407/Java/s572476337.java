import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String b = in.nextLine();
        int n = Integer.parseInt(b);
        String a = in.nextLine();
        String[] strAry = a.split(" ");

          while(n > 0){
              n--;
              System.out.print(strAry[n] + " ");
          }                                                                                   
    }
}   