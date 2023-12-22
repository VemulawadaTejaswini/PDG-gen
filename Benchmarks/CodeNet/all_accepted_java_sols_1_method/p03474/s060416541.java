import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    String str = sc.next();
    boolean test = true;

    for(int i=0; i < A; i++){
        if(Character.isDigit(str.charAt(i))){
            
        }else{
            test = false;
            break;
        }
    }
    for(int i=A+1; i < A+B+1; i++){
        if(Character.isDigit(str.charAt(i))){
            
        }else{
            test = false;
            break;
        }
    }
    if(str.matches(".*"+"-"+".*")){
         
    }else{
        test = false;
    }
    if(test){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
  }
}