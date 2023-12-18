import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
	int X=s.nextInt();
    int Y=s.nextInt();
    int i=0;
    
	for(;i<=X;i++){
      int x=i;
      int y=X-i;
      if(2*x+4*y==Y){
        System.out.println("Yes");
        break;
      }
    }
    
    if(i==X+1)System.out.println("No");
  }  
}