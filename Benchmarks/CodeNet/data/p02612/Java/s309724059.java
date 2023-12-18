import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     	int N = sc.nextInt();
      
      	int raise =(int) N %1000;
      	int answer = 0;
      	if(N!=0){
          int answer = N - (raise*1000);
        }
      	System.out.println(String.valueOf(answer));
    }
}