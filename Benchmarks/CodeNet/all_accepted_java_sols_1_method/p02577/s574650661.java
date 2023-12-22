import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] nChar = sc.next().toCharArray();
    int[] n = new int[nChar.length];
    int sum = 0;
    String ans;

    for (int cnt = 0; cnt < n.length; cnt++) {
      n[cnt] = Character.getNumericValue(nChar[cnt]);
      sum += n[cnt];
    }
    if(sum % 9 == 0){
      ans = "Yes";
    }
    else{
      ans = "No";
    }

    System.out.println(ans);
    sc.close();
  }
}
