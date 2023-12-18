import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int rimit = sc.nextInt();

    List<Integer> numList = new ArrayList<Integer>();

    for(int num = 1; num<=rimit ; num++){
      numList.add(sc.nextInt());
    }

    int ans = 0;
    int turn = 2;

    Collections.sort(numList, Collections.reverseOrder());

    for(int num : numList){
      if(turn % 2 == 0){
        ans += num;
      }else{
        ans -= num;
      }
      
      turn++;

    }

    System.out.println(ans);
  }

}