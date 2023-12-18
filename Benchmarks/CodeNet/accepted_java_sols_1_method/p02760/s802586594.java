import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int[] bingo = new int[9];
      
        for(int i = 0; i < 9; i++){
          bingo[i] = sc.nextInt();
        }
      
        while(sc.hasNext()){
          int next = sc.nextInt();
          for(int i = 0; i < 9; i++){
            if(bingo[i] == next){
              bingo[i] = 0;
            }
          }
        }
       
        String ans = "No";
        if(bingo[0] == bingo[1] && bingo[1] == bingo[2]){
          ans = "Yes";
        }else if(bingo[3] == bingo[4] && bingo[4] == bingo[5]){
          ans = "Yes";
        }else if(bingo[6] == bingo[7] && bingo[7] == bingo[8]){
          ans = "Yes";
        }else if(bingo[0] == bingo[3] && bingo[3] == bingo[6]){
          ans = "Yes";
        }else if(bingo[1] == bingo[4] && bingo[4] == bingo[7]){
          ans = "Yes";
        }else if(bingo[2] == bingo[5] && bingo[5] == bingo[8]){
          ans = "Yes";
        }else if(bingo[0] == bingo[4] && bingo[4] == bingo[8]){
          ans = "Yes";
        }else if(bingo[2] == bingo[4] && bingo[4] == bingo[6]){
          ans = "Yes";
        }
        
        System.out.println(ans);
	}

}