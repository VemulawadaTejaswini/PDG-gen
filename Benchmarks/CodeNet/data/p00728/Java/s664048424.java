public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		int max, min;
		int score;
		int x;
		
		
		while(true){
			score=0;
			max=0;
			min=1000;
			x=sc.nextInt();
			if(x==0){
				break;
			}else{
				N=x;
			}
			for(int i=0;i<N;i++){
				x=sc.nextInt();
				score+=x;
				if(x>=max){max=x;}
				if(x<=min){min=x;}
			}
			score=(score-min-max)/(N-2);
			System.out.println(score);
			
		}

	}

}