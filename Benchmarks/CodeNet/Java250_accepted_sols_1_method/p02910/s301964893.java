import java.util.*;
 
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    boolean a = true, b = true;
 
    for(int i=0;i<s.length();i+=2){
        if(s.charAt(i) == 'L'){
            a = false;
            break;
        }
    }
    
    for(int i=1;i<s.length();i+=2){
        if (!a){break;}
        if(s.charAt(i) == 'R'){
            b = false;
            break;
        }
    }
    
    if(a&&b){System.out.println("Yes");}
    else{System.out.println("No");}
  }
}