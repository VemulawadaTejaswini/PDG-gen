import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = in.nextInt();
        String a = in.nextLine();
        String[] strAry = a.split(" ");

          while(n > 0){
              n--;
              //System.out.print(strAry[n]);
              sb.append(strAry[n] + " ");
          }
          String str = new String(sb);
          String str_new = str.trim();
          System.out.print(str_new + "\n");
    }
}