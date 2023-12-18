import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] c = s.toCharArray();
    int total = 0;
    for(int i = 0;i<s.length();i++){
      if(c[i] == '1'){
        total += 1;
      }else if(c[i] == '2'){
        total += 2;
      }else if(c[i] == '3'){
        total += 3;
      }else if(c[i] == '4'){
        total += 4;
      }else if(c[i] == '5'){
        total += 5;
      }else if(c[i] == '6'){
        total += 6;
      }else if(c[i] == '7'){
        total += 7;
      }else if(c[i] == '8'){
        total += 8;
      }else if(c[i] == '9'){
        total += 9;
      }
    }
    if(total % 9 == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
