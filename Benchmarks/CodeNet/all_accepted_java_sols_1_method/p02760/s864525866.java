import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bingo = 9;
		int[] bingo_Number = new int[bingo];
        for(int i = 0;i < bingo;i++) {
        	int A = sc.nextInt();
        	bingo_Number[i] += A;
        	if(i == 8) {
            	int N = sc.nextInt();
                int[] bingo_Select = new int[N];
                for(int j = 0;j < N;j++) {
                	int b = sc.nextInt();
                	bingo_Select[j] += b;
                	if(bingo_Select[j] == bingo_Number[0]) {
                		bingo_Number[0] = 0;
                	}else if(bingo_Select[j] == bingo_Number[1]) {
                		bingo_Number[1] = 0;
                	}else if(bingo_Select[j] == bingo_Number[2]) {
                		bingo_Number[2] = 0;
                	}else if(bingo_Select[j] == bingo_Number[3]) {
                		bingo_Number[3] = 0;
                	}else if(bingo_Select[j] == bingo_Number[4]) {
                		bingo_Number[4] = 0;
                	}else if(bingo_Select[j] == bingo_Number[5]) {
                		bingo_Number[5] = 0;
                	}else if(bingo_Select[j] == bingo_Number[6]) {
                		bingo_Number[6] = 0;
                	}else if(bingo_Select[j] == bingo_Number[7]) {
                		bingo_Number[7] = 0;
                	}else if(bingo_Select[j] == bingo_Number[8]) {
                		bingo_Number[8] = 0;
                	}
                }
                if(bingo_Number[0] == 0 &&bingo_Number[1] == 0 && bingo_Number[2] == 0) {
                	System.out.println("Yes");
                }else if(bingo_Number[3] == 0 &&bingo_Number[4] == 0 && bingo_Number[5] == 0) {
                	System.out.println("Yes");
                }else if(bingo_Number[6] == 0 &&bingo_Number[7] == 0 && bingo_Number[8] == 0) {
                	System.out.println("Yes");
                }else if(bingo_Number[0] == 0 &&bingo_Number[3] == 0 && bingo_Number[6] == 0) {
                	System.out.println("Yes");
                }else if(bingo_Number[1] == 0 &&bingo_Number[4] == 0 && bingo_Number[7] == 0) {
                	System.out.println("Yes");
                }else if(bingo_Number[2] == 0 &&bingo_Number[5] == 0 && bingo_Number[8] == 0) {
                	System.out.println("Yes");
                }else if(bingo_Number[0] == 0 &&bingo_Number[4] == 0 && bingo_Number[8] == 0) {
                	System.out.println("Yes");
                }else if(bingo_Number[2] == 0 &&bingo_Number[4] == 0 && bingo_Number[6] == 0) {
                	System.out.println("Yes");
                }else {
                	System.out.println("No");
                }
            }
        }
	}
}