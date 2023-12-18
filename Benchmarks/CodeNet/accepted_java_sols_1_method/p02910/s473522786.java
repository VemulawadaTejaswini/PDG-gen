import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
      String flag = "OK";
      
      int count = a.length();
//      System.out.println("count=" +count);
      int i = 0;
      
      // 1桁目
      if((a.charAt(i))==('L')){
         // 奇数の時、LはNG
         flag = "NG";
      }else{
         // OK
      }
      
      for(i = 1; i < count; i++){
//      System.out.println("i=" +i);
        if(i % 2 != 0){
          // 偶数
          if((a.charAt(i))==('R')){
            // 偶数の時、RはNG
            flag = "NG";
          }else{
            // OK
          }
        }else{
          // 奇数
          if((a.charAt(i))==('L')){
            // 奇数の時、LはNG
            flag = "NG";
          }else{
            // OK
          }
        }
          
          if(flag.equals("NG")){
            break;
          }
        }
           
           // kekka
      if(flag.equals("OK")){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}