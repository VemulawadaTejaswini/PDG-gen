import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //int N = sc.nextInt();
    //int[] count = new int[N];
    String[] str = new String[2];
    
    for(int i=0; i<2; i++){
            str[i] = sc.next();
    }
    
    if(str[0].equals("H")){
        if(str[1].equals("H")){
            System.out.println("H");
        }else{
            System.out.println("D");
        }
    }else{
        if(str[1].equals("H")){
            System.out.println("D");
        }else{
            System.out.println("H");
        }
    }
  }
}