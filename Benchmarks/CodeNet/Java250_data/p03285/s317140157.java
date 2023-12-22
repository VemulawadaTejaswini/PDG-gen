import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt(); //判定金額
    int cates = 4;
    int donuts = 7;
    int sum = 0;
    boolean result = false;
    
    for(int i = 0; sum < n; i++){
      sum = donuts*i;
      if((n-sum)<0){
        break;
      }
      else if((n-sum)%cates==0){
        result = true;
        break;
      }
    }
    
    if(result){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
    
	}
}