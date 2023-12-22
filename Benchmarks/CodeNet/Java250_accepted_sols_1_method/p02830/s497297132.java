import java.util.*;
 class Main{

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String a = sc.next();
      String b = sc.next();
      StringBuilder sb = new StringBuilder("");
      for(int i=0,j=0; i<a.length() && j<b.length();i++,j++){
        sb.append((char)a.charAt(i)+"").append((char)b.charAt(j)+"");
      }
      System.out.println(sb);
    }
}
