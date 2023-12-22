import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int game[] = new int[n];   
		int people[] = new int[m];
		int score[] = new int[n];
		
		for(int i=0; i<n; i++) game[i]=sc.nextInt();
		for(int i=0; i<m; i++) people[i]=sc.nextInt();
		
		for(int i=0; i<m; i++)  //人
			for(int j=0; i<n; j++)   //競技
				if(people[i]>=game[j]){
					score[j]++;
					break;
				}
		
		int result=0;
		for(int i=0; i<n; i++)
			if(score[result]<score[i])
				result=i;
		
		System.out.println(result+1);
		
	}
}
			
	