import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    
    char[] c = str.toCharArray();
    
    if(c.length == 1) {
        if(c[0] == '?') System.out.println("D");
        else System.out.println(str);
        
        System.exit(0);
    }
    
    for(int i = 0; i < c.length; i++) {
        if(c[i] ==  '?'){
            if(i == 0) {
                if(c[i+1] == 'P') c[i] = 'D';
                else c[i] = 'P';
            } else if(i == c.length-1) {
                c[i] = 'D';
            } else {
                if(c[i-1] == 'P') c[i] = 'D';
                else {
                    if(c[i+1] == 'P') c[i] = 'D';
                    else c[i] = 'P';
                }
            }
        }
        
    }
    String str2 = new String(c);
    System.out.println(str2);
  }
}