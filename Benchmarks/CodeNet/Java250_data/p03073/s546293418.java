import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String S=scanner.next();
    String[] strArray = new String[S.length()];
    String[] strArray2 = new String[S.length()];
    int ans1=0;
    int ans2=0;

    for (int i = 0; i < S.length(); i++) {
      String str2 = String.valueOf(S.charAt(i));
      strArray[i] = str2;
    }

    System.arraycopy(strArray,0,strArray2,0,S.length());

    for(int i=0;i<S.length(); i++){
      if(i%2==0){
        if(strArray[i].equals("1")) ans1++;
        if(strArray[i].equals("0")) ans2++;
      }
      else{
        if(strArray[i].equals("0")) ans1++;
        if(strArray[i].equals("1")) ans2++;
      }
    }

    if(ans1<ans2) System.out.println(ans1);
    else System.out.println(ans2);
  }
}
