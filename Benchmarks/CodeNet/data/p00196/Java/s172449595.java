import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			String[] team = new String[n];
			int[] score = new int[n];
			for(int i = 0;i < n;i++){
				team[i] = scan.next();
				for(int j = 1;j < n;j++){
					int t = scan.nextInt();
					score[i] += (t == 0)?n:(t == 2)?1:0;
				}
			}
			for(int i = 0;i < n;i++){
				for(int j = n-1;j > i;j--){
					if(score[j] > score[j-1]){
						swap(score,team,j-1,j);
					}
				}
			}
			for(int i = 0;i < n;i++){
				System.out.println(team[i]);
			}
        }
	}
	
	public static void swap(int[] a,String[] b,int i,int j){
		int t = a[j];a[j] = a[i];a[i] = t;
		String tt = b[j];b[j] = b[i];b[i] = tt;
	}
}