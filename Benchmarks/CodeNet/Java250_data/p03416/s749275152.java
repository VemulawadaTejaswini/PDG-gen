import java.util.*;

 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int A1 = 0;
    int A2 = 0;
    int A4 = 0;
    int A5 = 0;
    int sum =0;
    for(int i = A ; i <= B; i++){
        A1 = i / 10000 % 10;
        A2 = (i / 1000) % 10;
        A4 = (i /10) % 10;
        A5 = i % 10; 
        if(A1 == A5 && A2 == A4){
            sum = sum +1;
        }
    }
        System.out.println(sum); 
    }
}    

