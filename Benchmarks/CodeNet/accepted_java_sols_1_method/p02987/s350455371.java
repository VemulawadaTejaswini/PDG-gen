import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[] ary = s.split("");
    int a = 0;
    s = ary[0];
    for( a = 1;a<4;a++){
      if(s.equals(ary[a])){
        break;
      }
    }
    switch(a){  
    case 1:if(!ary[2].equals(s)&&ary[2].equals(ary[3])){
        System.out.println("Yes");
      }else{
        System.out.println("No");     
      }break;
    case 2:if(!ary[1].equals(s)&&ary[1].equals(ary[3])){
        System.out.println("Yes");
      }else{
        System.out.println("No");     
      }break;
    case 3:if(!ary[1].equals(s)&&ary[2].equals(ary[1])){
        System.out.println("Yes");
      }else{
        System.out.println("No");     
      }break;
      default:System.out.println("No");   
    }
  } 
}