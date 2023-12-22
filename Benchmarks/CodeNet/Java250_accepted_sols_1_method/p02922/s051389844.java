import java.util.Scanner;
class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    int mouth = 1;
    int count = 0;
    
    for(int i=0;i<100;i++){      
      if(mouth<B){
        mouth += A-1;
        count++;
      }else{
        break;
      }
    }
     System.out.println(count);
  }
}