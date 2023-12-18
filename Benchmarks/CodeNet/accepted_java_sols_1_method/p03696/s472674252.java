import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String k = scan.next();
    char[] b = new char[n+1];
    for (int i=0;i<n;i++){
      b[i] = k.charAt(i);
    }
    b[n] = '1';

    ArrayList<String> a = new ArrayList<String>();

    int al = 0;
    int ar = 0;

    String current = "";
    int left = 0;
    for (int j=0;j<n;j++){
      if (b[j] == '('){
        left += 1;
        current = current +"(";
      }
      else{
        left -= 1;
        current = current + ")";
      }

      if ((b[j+1] == '(') && (left < 0)){
        a.add(current);
        al -= left;
        left = 0;
        current = "";
      }
    }


    if (current.length() > 0){
      if (left < 0){
        al -= left;
      }
      else{
        ar += left;
      }

      while (al > 0){
        System.out.print("(");
        al -= 1;
      }

      for (String g : a){
        System.out.print(g);
      }

      System.out.print(current);
      while (ar > 0){
        System.out.print(")");
        ar -= 1;
      }
      System.out.println("");

    }

  }

}
