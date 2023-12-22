import java.util.* ; 
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
	int n = scan.nextInt();
 	int x = scan.nextInt();
	int Max = Math.max(n,x) ;
    int min = Math.min(n,x) ;
    int count = 0 ;
    for(int i = min ; i<=Max ;i++){
      if((i*n*x) % 2 != 0){
        count++;
        break;
      }
    }
    if(count!=0){
      System.out.println("Yes");
    }else{
      System.out.println("No") ;
    }
    
  }
}