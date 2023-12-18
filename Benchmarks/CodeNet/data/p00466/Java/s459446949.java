import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
      int s=sc.nextInt();
      for(;;){
    	  int g=sc.nextInt();
    	  if(g==0)break;else s-=g;
      }
    System.out.println(s);
    }
    }