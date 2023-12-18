import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n1 = sc.nextInt();
    int n2 = 0;
    int n3 = n1;
    
    for(int i=0 ; i<10 ; i++){
      
      n2 += n3%10;
      n3 /=10;
      
      if(n3==0){
        break;
      }
    }
    
    if(n1%n2==0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}