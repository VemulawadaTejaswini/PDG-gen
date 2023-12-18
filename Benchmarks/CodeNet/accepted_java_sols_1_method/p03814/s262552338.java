import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int a = 0;
    int z = 0;
    boolean testA = false;
    //boolean testZ = false;
    int count = 0;
    
    for(int i=0; i<str.length(); i++){
        if(str.charAt(i) == 'A'){
            a = i;
            break;
        }
    }
    for(int i=str.length()-1; i>0; i--){
        if(str.charAt(i) == 'Z'){
            z = i;
            break;
        }
    }
    System.out.println(z-a+1);
  }
}