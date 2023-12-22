import java.util.*; 
public class Main{
  public static void main(String ... string){
    Scanner sc = new Scanner(System.in); 
    int a = sc.nextInt(),b = sc.nextInt(), c = sc.nextInt(); 
    for(int i = 1; i<b; i++){
      if((a*i - c)%b == 0){
        System.out.println("YES"); 
        return; 
      }
    }
    System.out.println("NO"); 
  }
                 
  }
