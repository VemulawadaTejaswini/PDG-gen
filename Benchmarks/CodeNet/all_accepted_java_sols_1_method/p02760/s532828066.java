import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int bingo[] = new int[9];
        for(int i = 0; i < 9; i++){
        	bingo[i] = sc.nextInt();
        }
    	int n = sc.nextInt();
        int num[] = new int[n];
        for(int i = 0; i < n; i++){
        	num[i] = sc.nextInt();
            for(int j = 0; j < 9; j++){
            	if(bingo[j] == num[i]){
                	bingo[j] = 101;
                }
            }
        }
        String ans = "No";
        //横一列bingo
        if((bingo[0] == bingo[1] && bingo[0] == bingo[2]) || (bingo[3] == bingo[4] && bingo[3] == bingo[5]) ||
          (bingo[6] == bingo[7] && bingo[6] == bingo[8])){
        	ans = "Yes";
        //縦一列bingo  
        }else if((bingo[0] == bingo[3] && bingo[0] == bingo[6]) || (bingo[1] == bingo[4] && bingo[1] == bingo[7]) ||
          (bingo[2] == bingo[5] && bingo[2] == bingo[8])){
        	ans = "Yes";
        //斜め一列bingo
        }else if((bingo[0] == bingo[4] && bingo[0] == bingo[8]) || (bingo[2] == bingo[4] && bingo[2] == bingo[6])){
        	ans = "Yes";
        }
        System.out.println(ans);
    }
}