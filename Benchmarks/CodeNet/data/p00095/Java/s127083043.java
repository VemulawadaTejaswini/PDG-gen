import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] entrant = new int[n][2];
		Main app = new Main();
		app.input(n, entrant);
		int index = app.max(n,entrant);
		
		System.out.println(entrant[index][0]+" "+entrant[index][1]);
	}
	
	public void input(int n,int[][] e){
		Scanner scan = new Scanner(System.in);
		String[] splitLine;
		for(int i=0;i<n;i++){
			splitLine = scan.nextLine().split(" ");
			e[i][0] = Integer.parseInt(splitLine[0]);
			e[i][1] = Integer.parseInt(splitLine[1]);
		}
	}
	
	public int max(int n,int[][] e){
		int index=0;
		int max=0;
		
		for(int i=0;i<n;i++){
			if(e[i][1] > max){
				max = e[i][1];
			}
		}
		
		for(int i=0;i<n;i++){
			if(e[i][1] == max){
				index = i;
				break;
			}
		}
		
		return index;
	}
}