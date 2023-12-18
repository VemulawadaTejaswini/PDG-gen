import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    
    int x = scanner.nextInt(); //next(文字列), nextDouble, nextLine(1行)とか
	int y = scanner.nextInt();
    int ans = 0;
    for (int i  = 0; i < y;i++){
      ans += scanner.nextInt();
    }

      
    if (x - ans >= 0){
    System.out.println(x - ans);
    }
    else{
    System.out.println(-1);
    }
  }
}
