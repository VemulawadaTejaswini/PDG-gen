import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //int A = sc.nextInt();
    int[] num = new int[5];
    //String str = sc.next();
    
    for(int i=0; i<5; i++){
       num[i] = sc.nextInt();
    }
    
    num[0] = num[0] * 60;
    num[2] = num[2] * 60;

    System.out.println((num[2]+num[3])-(num[0]+num[1]+num[4]));
    //if(str[0].equals("H"));
  }
}
