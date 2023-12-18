import java.util.*;
public class Main{
  static Scanner sc = new Scanner(System.in);
  int [] owned_stones;
	public static void main(String [] args){
    while(true){
      int candidates = sc.nextInt();
      int stones = sc.nextInt();
      int ans;
      if(candidates == 0 && stones == 0){
        break;
      }
      ans = solve(candidates, stones);
      System.out.println(ans);
    }
	}

  static int solve(int candidates, int stones){
    int current_stones = stones;
    int[] owned_stones = new int[candidates];
    int i = 0;
    int candidates_num;
    while(true){
      candidates_num = i % candidates;
      if(current_stones > 0){
        current_stones--;
        owned_stones[candidates_num] += 1;
        if(current_stones == 0){
          if(owned_stones[candidates_num] == stones){
            break;
          }
        }
      }else{
        current_stones = owned_stones[candidates_num];
        owned_stones[candidates_num] = 0;
      }
      i++;
    }
    return candidates_num;
  }
}