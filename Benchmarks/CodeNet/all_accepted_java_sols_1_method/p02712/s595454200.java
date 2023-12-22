import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
		long te = 0;
      	for(int i = 0;i<=num;i++){
          if(i%3==0 || i%5==0){
          }else{
            te += i;
          }
        }
      	System.out.println(te);
    }
}