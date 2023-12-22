import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int N = sc.nextInt();
    int[] num = new int[N];
    int count = 0;
    
    for(int i=0; i<N; i++){
        num[i] = sc.nextInt();
        H -= num[i];
    }
    //if(str.charAt(0) == str.charAt(1)){
    //}
    if(H<=0){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
  }
}