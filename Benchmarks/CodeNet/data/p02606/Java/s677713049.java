import java.util.Scanner;
 
public class Main {
  public static void main(String[] args ) {
    Scanner sc = new Scanner(System.in);
     int start=sc.nextInt();
     int end = sc.nextInt();
     int devide=sc.nextInt();
     int j = 0;
     for(int i=start;i<=end;i++){
       if(i%devide==0){
         j=j+1; 
       }
     }
     System.out.println(j);
  }
}