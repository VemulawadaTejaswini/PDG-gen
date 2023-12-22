import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //int N = sc.nextInt();
    int[] num = new int[4];

    for(int i=0; i < 4; i++){
        num[i] = sc.nextInt();
    }
    int ab = num[0] - num[1];
    if(ab < 0){
        ab = (-1)*ab;
    }
    int bc = num[1] - num[2];
    if(bc < 0){
        bc = (-1)*bc;
    }
    int ca = num[2] - num[0];
    if(ca < 0){
        ca = (-1)*ca;
    }
    int d = num[3];
    
    if(ca == 0){
        System.out.println("Yes");
    }else if(ca <= d){
        System.out.println("Yes");
    }else if(ab <= d && bc <= d){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
  }
}