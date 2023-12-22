import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String strS[] = sc.next().split("");
    String strT[] = sc.next().split("");
    for (int i=strS.length-1; i >= 0 ; i--){
        String tmp = strS[strS.length-1];
        for (int j=strS.length-1; j > 0 ; j--){
            strS[j] = strS[j-1];
        }
        strS[0] = tmp;
        if(Arrays.equals(strS,strT)){
            System.out.println("Yes");
            return;
        }        
    }
    System.out.println("No");
  }
}