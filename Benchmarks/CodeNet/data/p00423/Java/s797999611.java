import java.util.Scanner;


class Main{
  
  public static void main(String[] args){
    
    while(true){
      int A = 0, B = 0;
      
      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      
      if(N == 0){
	break;
      }

      for(int i = 0; i < N; i++){
	int a = sc.nextInt();
	int b = sc.nextInt();

	if(a > b){
	  A += a + b;
	}else if(a < b){
	  B += a + b;
	}else{
	  A += a;
	  B += b;
	}
      }
      
      System.out.println(A + " " + B);
    }
  }
}