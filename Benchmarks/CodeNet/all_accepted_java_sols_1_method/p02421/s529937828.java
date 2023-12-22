import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int tru = 0;
    int hnk = 0;

    for(int i = 0; i < n; i++){
      String t = sc.next();
      String h = sc.next();

      if(t.compareTo(h) < 0){
        hnk += 3;
      } else if(t.compareTo(h) > 0){
        tru += 3;
      } else if(t.equals(h)){
        tru += 1;
        hnk += 1;
      }
    }

    System.out.println(tru + " " + hnk);
  }
}

