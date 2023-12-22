import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int left = 0;
    int right = n+1;
    int tmpLeft , tmpRight;
    for(int i=0;i<m;i++){
      
      tmpLeft = Integer.parseInt(sc.next());
      tmpRight = Integer.parseInt(sc.next());
      if(tmpLeft>left)left = tmpLeft;
      if(tmpRight<right)right = tmpRight;
    }
    if(right>=left){
      System.out.print(right-left+1);
    }else{
      System.out.print(0);
    }
   
    System.out.flush();
    
  }
}