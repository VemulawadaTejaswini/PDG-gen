import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int type   = sc.nextInt(); //ドーナツ種類
    int powder = sc.nextInt(); //粉
    int mini   = 0;            //一番小さいドーナツ
    int count = 0;
    
    for(int i = 0 ; i < type ; i++){
      int temp = sc.nextInt();
      powder -= temp;
      if(mini == 0){mini=temp;}
      else if(mini > temp){mini=temp;}
    }
    
    while(mini <= powder){
      powder -= mini;
      count++;
    }
    System.out.println(count + type);
  }
}
