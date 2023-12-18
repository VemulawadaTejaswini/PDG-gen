import java.util.Scanner;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    boolean judge=false;
    String str = Integer.toString(N);
      String []resultArray = str.split("");
      for(int i = 0; i < resultArray.length; i++){
        if(resultArray[i].equals("7")){
      judge=true;
        }
      }


      if (judge) {
        System.out.println("Yes");
      }else{
       System.out.println("No");
      }
        }
      }
