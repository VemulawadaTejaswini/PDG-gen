import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		int data[] = new int[4];	
		n = sc.nextInt();
		
		int score[] = new int[n];
		
		for(int i=0; i<n*(n-1)/2; i++){
			for(int j=0; j<4; j++){
				data[j]=sc.nextInt();
			}
			if(data[2]>data[3]){
				score[(data[0]-1)]+=3;
			}
			else if(data[3]>data[2]){
				score[(data[1]-1)]+=3;
			}
			else if(data[2]==data[3]){
				score[(data[0]-1)]+=1;
				score[(data[1]-1)]+=1;
			}
		}
		
		int result;
		for(int i=0; i<n; i++){
			result=1;
			for(int j=0; j<n; j++){
				if(score[i]<score[j]) result++;
			}
			System.out.println(result);
		}

	}

}