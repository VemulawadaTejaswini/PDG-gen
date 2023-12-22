import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    long N = sc.nextInt();
    int K = sc.nextInt();
    int keta = 0;
    
    for(int i = 1; ; i++){
    	if(N < Math.pow(K, i)){
          keta = i;
          break;
        }
    }
    System.out.println(keta);
  }
}
