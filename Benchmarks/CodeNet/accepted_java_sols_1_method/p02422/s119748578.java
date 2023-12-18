import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String astr = sc.next();
      StringBuffer str = new StringBuffer(astr);
      int q = sc.nextInt();
      while(sc.hasNext()) {
        String program = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (program) {
          case "print":
            System.out.println(str.substring(a,b+1));
            break;
          case "reverse":
            String asubstr = str.substring(a,b+1);
            StringBuffer substr = new StringBuffer(asubstr);
            substr = substr.reverse();
            str = str.delete(a,b+1);
            str = str.insert(a,substr);
            break;
          case "replace":
            String p = sc.next();
            str = str.delete(a,b+1);
            str = str.insert(a,p);
            break;
        }
      }   
    }
}
