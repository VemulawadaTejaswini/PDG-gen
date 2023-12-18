import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      String a = sc.next();
      String []b  = a.split(""); 
      if(b[a.length()-1].equals("s")){
      	System.out.println(a+"es");
      }else{
      	System.out.println(a+"s");
      }
    }
}