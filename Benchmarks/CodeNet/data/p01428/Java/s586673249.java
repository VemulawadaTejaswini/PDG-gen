import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		String[] s = new String[8];
		int[][] map = new int[8][8];
		boolean turn = true;
		boolean judge = true;
		int nextx = -1;
		int nexty = -1;
		int nowcount = 0;
		int[] dx = {1,1,0,-1,-1,-1,0,1};
		int[] dy = {0,-1,-1,-1,0,1,1,1};
		for(int i=0;i<8;i++){
			Arrays.fill(map[i], -1);
		}
		for(int i=0;i<8;i++){
			s[i] = sc.next();
		}
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(s[i].charAt(j)=='o'){
					map[i][j] = 0;
				}
				else if(s[i].charAt(j)=='x'){
					map[i][j] = 1;
				}
			}
		}
		boolean flag = false;
		boolean flags = false;
		while(judge){
			String xxx = sc.next();
			nowcount = 1;
			nextx = -1;
			nexty = -1;
			if(turn){
				for(int i=0;i<8;i++){
					for(int j=0;j<8;j++){
						int count = 0;
						if(map[i][j]==-1){
							for(int k=0;k<8;k++){
								if(i+dx[k]<0 || i+dx[k]>7){
									continue;
								}
								if(j+dy[k]<0 || j+dy[k]>7){
									continue;
								}
								if(map[i+dx[k]][j+dy[k]]==0){
									for(int l=2;l<8;l++){
										if(i+l*dx[k]<0 || i+l*dx[k]>7){
											break;
										}
										if(j+l*dy[k]<0 || j+l*dy[k]>7){
											break;
										}
										if(map[i+l*dx[k]][j+l*dy[k]]==-1){
											break;
										}
										if(map[i+l*dx[k]][j+l*dy[k]]==1){
											count += l - 1;
											break;
										}
									}
								}
							}
							if(nowcount<=count){
								nextx = i;
								nexty = j;
								nowcount = count;
							}
						}
					}
				}
				if(nextx != -1){
					for(int k=0;k<8;k++){
						if(nextx+dx[k]<0 || nextx+dx[k]>7){
							continue;
						}
						if(nexty+dy[k]<0 || nexty+dy[k]>7){
							continue;
						}
						if(map[nextx+dx[k]][nexty+dy[k]]==0){
							for(int l=2;l<8;l++){
								if(nextx+l*dx[k]<0 || nextx+l*dx[k]>7){
									break;
								}
								if(nexty+l*dy[k]<0 || nexty+l*dy[k]>7){
									break;
								}
								if(map[nextx+l*dx[k]][nexty+l*dy[k]]==-1){
									break;
								}
								if(map[nextx+l*dx[k]][nexty+l*dy[k]]==1){
									while(l>0){
										l--;
										map[nextx+l*dx[k]][nexty+l*dy[k]] = 1;
									}						
									break;
								}
							}
						}
					}
				}
				else{
					flag = true;
				}
			}
			else{
				nowcount = 0;
				for(int i=0;i<8;i++){
					for(int j=0;j<8;j++){
						int count = 0;
						if(map[i][j]==-1){
							for(int k=0;k<8;k++){
								if(i+dx[k]<0 || i+dx[k]>7){
									continue;
								}
								if(j+dy[k]<0 || j+dy[k]>7){
									continue;
								}
								if(map[i+dx[k]][j+dy[k]]==1){
									for(int l=2;l<8;l++){
										if(i+l*dx[k]<0 || i+l*dx[k]>7){
											break;
										}
										if(j+l*dy[k]<0 || j+l*dy[k]>7){
											break;
										}
										if(map[i+l*dx[k]][j+l*dy[k]]==-1){
											break;
										}
										if(map[i+l*dx[k]][j+l*dy[k]]==0){
											count += l;
											break;
										}
									}
								}
							}
							if(nowcount<count){
								nextx = i;
								nexty = j;
								nowcount = count;
							}
						}
					}
				}
				if(nextx != -1){
					for(int k=0;k<8;k++){
						if(nextx+dx[k]<0 || nextx+dx[k]>7){
							continue;
						}
						if(nexty+dy[k]<0 || nexty+dy[k]>7){
							continue;
						}
						if(map[nextx+dx[k]][nexty+dy[k]]==1){
							for(int l=2;l<8;l++){
								if(nextx+l*dx[k]<0 || nextx+l*dx[k]>7){
									break;
								}
								if(nexty+l*dy[k]<0 || nexty+l*dy[k]>7){
									break;
								}
								if(map[nextx+l*dx[k]][nexty+l*dy[k]]==-1){
									break;
								}
								if(map[nextx+l*dx[k]][nexty+l*dy[k]]==0){
									while(l>0){
										l--;
										map[nextx+l*dx[k]][nexty+l*dy[k]] = 0;
									}						
									break;
								}
							}
						}
					}
				}
				else{
					flags = true;
				}
			}
			if(flag && flags){
				judge = false;
			}
			int counter = 0;
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){
					if(map[i][j]!=-1){
						counter++;
					}
					/*if(map[i][j]==-1){
					System.out.print(".");
				}
				if(map[i][j]==0){
					System.out.print("o");
				}
				if(map[i][j]==1){
					System.out.print("x");
				}*/
				}
				//System.out.println();
			}
			/*try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}*/
			//System.out.println(nextx+" "+nexty+" "+counter);
			if(counter>=64){
				judge = false;
			}
			if(turn){
				flags = false;
			}
			else{
				flag = false;
			}
			turn = !turn;
		}
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(map[i][j]==-1){
					System.out.print(".");
				}
				if(map[i][j]==0){
					System.out.print("o");
				}
				if(map[i][j]==1){
					System.out.print("x");
				}
			}
			System.out.println();
		}
	}
}

