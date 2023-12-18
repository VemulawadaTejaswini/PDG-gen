import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int n = 0;

      for(int i=0;i<4;i++){
        if(a.charAt(i)=='+'){
          n++;
        }else{
          n--;
        }
        
      }
            System.out.println(n);
    }
}