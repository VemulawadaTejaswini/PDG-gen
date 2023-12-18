import java.util.Scanner;
public class Main{
    public static void main(String[] args){
      Scanner sc =new Scanner(System.in);
      int i,N;
      N=sc.nextInt();
      for(i=1;i<=N;i++){
          if(i%3==0)||(i%10==3)){
            System.out.print(" "+i);
          }
      }      
    }
}
