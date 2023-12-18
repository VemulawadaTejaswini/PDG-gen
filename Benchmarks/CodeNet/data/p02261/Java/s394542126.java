import java.util.Scanner;
public class Main {
	static void output(int[][] card,int N){
		boolean judge=true;
		System.out.printf("%c%d",card[0][2],card[0][0]);
		for(int i=1;i<N;i++){
			System.out.printf(" %c%d",card[i][2],card[i][0]);
			if((card[i][0]==card[i-1][0])&&!(card[i-1][1]<card[i][1])){
				judge=false;
			}
		}
		System.out.println();
		if(judge) System.out.println("Stable");
		else System.out.println("Not stable");
	}
	static void BubbleSort(int[][] card,int N){
		int t;
		for(int i=0;i<N;i++){
			for(int j=N-1;i<j;j--){
				if(card[j][0]<card[j-1][0]){
					t=card[j][0];
					card[j][0]=card[j-1][0];
					card[j-1][0]=t;
					t=card[j][1];
					card[j][1]=card[j-1][1];
					card[j-1][1]=t;
					t=card[j][2];
					card[j][2]=card[j-1][2];
					card[j-1][2]=t;
				}
			}
		}
		output(card,N);
	}
	static void SelectionSort(int[][] card,int N){
		int min,t;
		for(int i=0;i<N;i++){
			min=i;
			for(int j=i;j<N;j++){
				if(card[j][0]<card[min][0]){
					min=j;
				}
			}
			t=card[i][0];
			card[i][0]=card[min][0];
			card[min][0]=t;
			t=card[i][1];
			card[i][1]=card[min][1];
			card[min][1]=t;
			t=card[i][2];
			card[i][2]=card[min][2];
			card[min][2]=t;
		}
		output(card,N);
	}
	static void cardcopy(int[][] card,int[][] copy,int N){
		for(int i=0;i<N;i++){
			copy[i][0]=card[i][0];
			copy[i][1]=card[i][1];
			copy[i][2]=card[i][2];
		}
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s;
		int[] counter=new int[9];
		int N=scan.nextInt();
		int[][] card=new int[N][3];
		int[][] copy=new int[N][3];
		for(int i=0;i<N;i++){
			s=scan.next();
			card[i][0]=s.charAt(1)-'0';
			card[i][1]=counter[card[i][0]-1];
			card[i][2]=s.charAt(0);
			counter[card[i][0]-1]++;
		}
		cardcopy(card,copy,N);//一回目のコピーの作成
		BubbleSort(copy,N);
		cardcopy(card,copy,N);
		SelectionSort(copy,N);
		scan.close();
	}
}