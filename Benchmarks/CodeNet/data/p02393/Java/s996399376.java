import java.util.*;

class Main {
    static int a,b,c,small,middle,large;
  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();    
      b = sc.nextInt();    
      c = sc.nextInt();
      if (a>b) {
        if (b>c) {
          small = c;
          middle = b;
          large = a;
        } else {
          small = b;
          if (a>c) {
            large = a;
            middle = c;
          } else { 
            middle = c;
            large = a;
          } 
        }
      } 
      
      if (a<=b) {
        if(b<c) {
          small = a;
          middle = b;
          large = c;
        } else {
          large = b;
          if (a>c) {
            small = c;
            middle = a;
          } else { 
            small = a;
            middle = c;
          } 
        }
      } 
       System.out.println(small + " " + middle + " " + large);
    }
}
