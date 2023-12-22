import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int people = sc.nextInt();
    int point = sc.nextInt();
    int q_cnt = sc.nextInt();
    int[] correcter = new int[q_cnt];
    int[] points = new int[people];
    
    for(int i = 0; i < q_cnt; i++){
       correcter[i] = sc.nextInt();
    }
    
    for(int j = 0; j < q_cnt; j++){      
        points[correcter[j] - 1]++;
    }
    
    for(int i = 0; i < people; i++){
      if(points[i] + point - q_cnt >= 1){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
  }
}