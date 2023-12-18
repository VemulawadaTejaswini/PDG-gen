import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String[] arr = new String[n];
    for(int i=0;i<n;i++){
      String type = scan.next();
      arr[i] = type;
    }
    int AC = 0;
    int WA= 0;
    int TLE = 0;
    int RE = 0;
    for(String a:arr){
      if(a.equals("AC")){
        AC++;
      }else if(a.equals("WA")){
        WA++;
      }else if(a.equals("TLE")){
        TLE++;
      }else if(a.equals("RE")){
        RE++;
      }
    }
    System.out.println("AC × " + AC);
    System.out.println("WA × " + WA);
    System.out.println("TLE × " + TLE);
    System.out.println("RE × " + RE);
  }
}