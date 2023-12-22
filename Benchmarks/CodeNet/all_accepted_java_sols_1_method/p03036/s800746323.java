import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int d = sc.nextInt();
    int x[] = new int[11];
        x[0]= sc.nextInt();
    
    for(int i=0;i<10;i++){
        System.out.println(r*x[i]-d); 
        x[i+1]=r*x[i]-d;
    }
       
  }
}