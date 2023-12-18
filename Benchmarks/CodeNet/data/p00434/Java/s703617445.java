import java.util.Scanner;

class Main{

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);

		boolean[] ans = new boolean[31];

		for(int i=0;i<=30;i++){
			ans[i]=false;
		}


		for(int i=1;i<=28;i++){
			ans[scan.nextInt()]=true;
		}
		
		for(int i=1;i<=30;i++){
			if(ans[i]==false){
				System.out.println(i);
			}
		}
			
	}

}