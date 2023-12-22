import java.util.*;
 
class Main {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    
    int S = scanner.nextInt(); //next(文字列), nextDouble, nextLine(1行)とか   
    int k = 0;
    int X = S; //Sの桁数を求めるパート
    while (X > 0){
      k++;
      X /= 10;
    }                  
    int[] A = new int[4]; //Sの各桁を配列に入れる
    if (k == 3){
      A[3] = 0;
        for (int i = 0; i < A.length-1; i++){
        A[i] = S % 10;
        S /= 10;
    	}
    }else{
    for (int i = 0; i < A.length; i++){
      A[i] = S % 10;
      S /= 10;
    }
    }
    
    for (int bit = 0; bit < (1<<(A.length-1));bit++){      
      int ans = 0;
      int[] B = new int[3];
      for (int j = 0; j < A.length-1; j++){
        if ((bit & (1 << j)) == 0){
          ans += A[j];
          B[j] = 0;
        }else{
          ans -= A[j];
          B[j] = 1;
        }     
       }
       ans += A[3];
       if (ans == 7){       
        System.out.print(A[3]);
        for (int h = 0; h < 3; h++){
          if (B[2-h]==0){
          	System.out.print("+");
          }else{
            System.out.print("-");
          }
          System.out.print(A[2-h]);
        }
        System.out.println("=7");
        break;
      }
    }     
  }
}
