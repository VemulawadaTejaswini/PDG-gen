import java.util.*;
public class Main {
	public static void main(String[] args) {
		char pattern[] = {'S','H','C','D'};
		int cards[][] = new int[4][13];
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		
		for(int i=0;i<n;i++){
			char p =sc.next().charAt(0);
			int r = sc.nextInt();
			for(int j=0;j<4;j++){
				if(p == pattern[j]){
					cards[j][r-1]=1;
				}
			}
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<13;j++){
				if(cards[i][j]==0){
					System.out.println(pattern[i]+" "+ (j+1));
				}
			}
		}
	}

}