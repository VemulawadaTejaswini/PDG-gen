import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
 
    int a = n%1000;
    
    if(a==0) {
    System.out.println(a);
    }else{
    System.out.println(1000-a);
      }
}
}

