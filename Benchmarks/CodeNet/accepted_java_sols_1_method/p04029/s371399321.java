import java.util.*;
class Main{
  public static void main(String[] arg){
    Scanner stdIn=new Scanner(System.in);
    int N=stdIn.nextInt();
    int total=0;
    for(int i=1;i<=N;i++){
      total+=i;
    }
    System.out.println(total);
  }
}
      
    
    