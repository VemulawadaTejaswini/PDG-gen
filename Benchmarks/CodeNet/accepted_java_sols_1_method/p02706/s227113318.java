import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      
       int N =sc.nextInt();
       int M =sc.nextInt();
       int a=0;
      
      for(int i=1;i<=M;i++){
        a +=sc.nextInt();
      }
       if(N-a >=0){
       System.out.println(N-a);
       }
        else if(N-a <0)  {
        System.out.println("-1");
        }
    }
}