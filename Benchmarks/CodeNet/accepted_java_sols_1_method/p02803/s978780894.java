import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		
		int w = sc.nextInt();
		
		boolean[][] cells = new boolean[h+2][w+2];
		for(int i=0;i<w+2;i++) {
			cells[0][i]=false;
			cells[h+1][i]= false;
		}
		for(int i =0;i<h+2;i++) {
			cells[i][0]= false;
			cells[i][w+1] = false;
		}
		for(int i=1;i<h+1;i++) {
			String s = sc.next();
			String[] ss = s.split("");
			for(int j=1;j<w+1;j++) {
				if(ss[j-1].equals(".")) {
					cells[i][j]=true;
				}else {
					cells[i][j]=false;
				}
			}
		}
		
		int highest = 0;
		
		for(int i=1;i<h+1;i++) {
			for(int j=1;j<w+1;j++) {
				if(cells[i][j]) {
					int[][] costs = new int[h+2][w+2];
					for(int l=0;l<h+2;l++) {
						for(int m=0;m<w+2;m++) {
							costs[l][m]=10000;
						}
					}
					costs[i][j]=0;
					boolean checker = true;
					while(checker) {
						checker=false;
						for(int l=1;l<h+1;l++) {
							for(int m=1;m<w+1;m++) {
								if(cells[l][m]) {
									if(cells[l+1][m]) {
										if(costs[l+1][m]>costs[l][m]+1) {
											checker=true;
											costs[l+1][m]=costs[l][m]+1;
										}
									}
									if(cells[l-1][m]) {
										if(costs[l-1][m]>costs[l][m]+1) {
											checker=true;
											costs[l-1][m]=costs[l][m]+1;
										}
									}
									if(cells[l][m+1]) {
										if(costs[l][m+1]>costs[l][m]+1) {
											checker=true;
											costs[l][m+1]=costs[l][m]+1;
										}
									}
									if(cells[l][m-1]) {
										if(costs[l][m-1]>costs[l][m]+1) {
											checker=true;
											costs[l][m-1]=costs[l][m]+1;
										}
									}
								}
							}
						}
					}
					int subhigh = 0;
					for(int l=1;l<h+1;l++) {
						for(int m=0;m<w+1;m++) {
							if(subhigh < costs[l][m]&& costs[l][m]<10000)subhigh=costs[l][m];
						}
					}
					if(subhigh>highest)highest=subhigh;
				}
				
			}
		}
		System.out.println(highest);
	}
	
}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/
