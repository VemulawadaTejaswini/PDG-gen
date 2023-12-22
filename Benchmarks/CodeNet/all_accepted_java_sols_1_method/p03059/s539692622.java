import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int count=0;
    for(int i=1;i<C+1;i++){
    	if(i%A==0){
        count++;
        }
    }
    count *=B;
   System.out.println(count);
  }
}