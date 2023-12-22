import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();
    String A = scan.next();
    String B = scan.next();
    String C = scan.next();
    String choiceOfA = "0";
    String choiceOfB = "0";
    String choiceOfC = "0";
    int ans = 0;
    for (int i = 0;i<N ;i++ ) {
      choiceOfA = A.substring(i,i+1);
      choiceOfB = B.substring(i,i+1);
      choiceOfC = C.substring(i,i+1);
      if (!choiceOfA.equals(choiceOfB) && !choiceOfB.equals(choiceOfC) && !choiceOfC.equals(choiceOfA)) {
        ans+=2;
      }else if((choiceOfA.equals(choiceOfB) && !choiceOfB.equals(choiceOfC) || (choiceOfB.equals(choiceOfC) && !choiceOfC.equals(choiceOfA)) || (choiceOfC.equals(choiceOfA) && !choiceOfA.equals(choiceOfB)))) ans++;
    }
    System.out.println(ans);
  }
}
