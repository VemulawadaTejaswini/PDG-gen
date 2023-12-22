import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        String s = sc.next();
      int flag=0;
      for(int i=0;i<3;i++){
        if(s.charAt(i)==s.charAt(i+1)) flag++;
      }
    
        System.out.println(flag==0?"Good":"Bad");
    }

}
