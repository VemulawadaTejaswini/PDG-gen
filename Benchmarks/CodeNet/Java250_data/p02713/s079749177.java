import java.util.*;


class Main {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    
    int N = scanner.nextInt(); //next(文字列), nextDouble, nextLine(1行)とか
    int ans = 0;
    for (int i = 1; i <= N ; i++){
      for (int j = 1; j <= N; j++){
        for (int k = 1; k <= N; k++){
          ans += GCD(i,j,k);
        }
      }
    }
    System.out.println(ans);
  }

  public static int GCD(int x, int y, int z) {
    
    while (x != y){
      if (x > y){
        x = x-y;
      }else{
        y = y -x;
      }
    }
    
    while (x != z){
      if (x > z){
        x = x-z;
      }else{
        z = z -x;
      }
    }    
    return z;
  }


}


