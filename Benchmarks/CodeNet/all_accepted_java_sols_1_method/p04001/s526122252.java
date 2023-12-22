import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    
    long S = scanner.nextLong(); //next(文字列), nextDouble, nextLine(1行)とか   
    int k = 0;
    long X = S; //Sの桁数を求めるパート
    while (X > 0){
      k++;
      X /= 10;
    }                  
    long[] A = new long[k]; //Sの各桁を配列に入れる
    for (int i = 0; i < A.length; i++){
      A[i] = S % 10;
      S /= 10;
    }    
    
    long ans = 0;
    for (long bit = 0; bit < (1<<(A.length-1));bit++){
      long temp = 0;
      long ten = 1;
      for (int j = 0; j < A.length; j++){
        temp += A[j]*ten;
        if ((bit & (1 << j)) == 0){
          ten *= 10;
          if (j == A.length-1){
            ans += temp;
          }
        }else{
          ans += temp;
          temp = 0;
          ten = 1;

        }
      }
    }
    System.out.println(ans);     
  }
}
