import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      String s = sc.next();
      int lng = s.length();
      char[] c = new char[lng];
      for(int i=0;i<lng;i++){
        c[i] = s.charAt(i);
      }

      int flag = 0;

      if(lng%2==1){
        flag = 1;
      }
      else{
        int lng2 = lng/2;
        for(int i=0;i<lng2;i++){
          if(c[i]!=c[lng2+i]){
            flag = 1;
            break;
          }
        }
      }


      if(flag==0){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }

    }
}
