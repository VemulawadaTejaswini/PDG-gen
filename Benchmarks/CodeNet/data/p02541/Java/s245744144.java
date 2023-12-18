import java.util.*;

public class Main {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     	int num = sc.nextInt();
		int k = 1;
      	for(int i = 2; i < num; i++){
          k = k+i;
          if(num % k == 0){
          	System.out.println(k);
            break;
          }
        }
		
    }
}
