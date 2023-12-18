import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
	int an = N%K;
      if(an ==0){
    System.out.println("0");
    }else{
    System.out.println("1");      
    }
}
}