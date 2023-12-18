import java.util.Scanner;
class Main {
	public static void main(String args[]){
		int[][] timeCard = new int[3][6];
		Scanner scan = new Scanner(System.in);
		Main app = new Main();
		while(scan.hasNext()){
			app.input(timeCard,scan);
			app.workTime(timeCard);
			app.output(timeCard);
		}
	}
	
	public void input(int[][] timeCard,Scanner scan){
		for(int i=0;i<3;i++){
			String str = scan.nextLine();
			String[] splitLine = str.split(" ");
			for(int j=0;j<6;j++){
				timeCard[i][j] = Integer.parseInt(splitLine[j]);
			}
		}
	}
	
	public void workTime(int[][] timeCard){
		for(int i=0;i<3;i++){
			for(int j=2;j>=0;j--){
				if(timeCard[i][j] > timeCard[i][j+3]){
					timeCard[i][j+2]--;
					timeCard[i][j+3] += (60-timeCard[i][j]);
				}else{
					timeCard[i][j+3] -= timeCard[i][j];
				}
			}
		}
	}
	
	public void output(int[][] timeCard){
		for(int i=0;i<3;i++){
			System.out.println(timeCard[i][3]+" "+timeCard[i][4]+" "+timeCard[i][5]);
		}
	}
}