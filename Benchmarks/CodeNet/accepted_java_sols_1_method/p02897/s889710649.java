import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    double a = sc.nextInt();
    double odd1 = 0;
    double odd2 = 0;
    
    for(int i=1 ; i<=a ; i++){
      if(i%2==0){
        odd2++;
      }else{
        odd1++;
      }
    }
    
    System.out.println(odd1/a);
  }
}
  	
    