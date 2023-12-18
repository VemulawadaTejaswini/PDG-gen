import java.util.Random;
import java.util.Scanner;

public class Main {
	static int h,w;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		h = scan.nextInt();
		w = scan.nextInt();
		int lebel=0,result=0,flag=0;
		int[][] d = new int[h][w];
		for(int i=0;i<h;++i){
			for(int j=0;j<w;++j){
				d[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<h;++i){
			for(int j=0;j<w;++j){
				if(d[i][j]==0){
					lebel=cheak1(d,i,j);
					int lebel2=cheak2(d,i,j);
					int lebel3=cheak3(d,i,j);
					int lebel4=cheak4(d,i,j);
					flag=1;
					if(lebel2>lebel){
						lebel=lebel2;
						flag=2;
					}
					if(lebel3>lebel){
						lebel=lebel3;
						flag=3;
					}
					if(lebel4>lebel){
						lebel=lebel4;
						flag=4;
					}
					if(lebel==1 && result<1){
						result=1;
					} else {
						if(lebel*lebel>result){
							int r =cul(d,i,j,lebel,flag);
							if(result<r){
								result=r;
							}
						}
					}
				}
			}
		}
		System.out.println(result);
	}

	public static int cheak1(int[][] data, int i, int j){
		int n=i-1,m=j-1,lebel=1;
		if(0<=n && 0<=m){
			while(data[n][j]==0 && data[i][m]==0){
				lebel++;
				n--;
				m--;
				if(n<0 || m<0){
					break;
				}
			}
		}
		return lebel;
	}
	
	public static int cheak2(int[][] data, int i, int j){
		int n=i-1,m=j+1,lebel=1;
		if(0<=n && m<w){
			while(data[n][j]==0 && data[i][m]==0){
				lebel++;
				n--;
				m++;
				if(n<0 || w<=m){
					break;
				}
			}
		}
		return lebel;
	}
	
	public static int cheak3(int[][] data, int i, int j){
		int n=i+1,m=j-1,lebel=1;
		if(n<h && 0<=m){
			while(data[n][j]==0 && data[i][m]==0){
				lebel++;
				n++;
				m--;
				if(h<=n || m<0){
					break;
				}
			}
		}
		return lebel;
	}
	
	public static int cheak4(int[][] data, int i, int j){
		int n=i+1,m=j+1,lebel=1;
		if(n<h && m<w){
			while(data[n][j]==0 && data[i][m]==0){
				lebel++;
				n++;
				m++;
				if(h<=n || w<=m){
					break;
				}
			}
		}
		return lebel;
	}

	public static int cul(int[][] data, int i, int j, int lebel, int flag){
		int num,flag2=0,flag3=0,x=i,y=j;
		for(num=2;num<lebel+1;++num){
			if(flag==1){
				i--;
				j--;
				flag2=cul1(data,x,j,num);
				flag3=cul3(data,i,y,num);
			}
			if(flag==2){
				i--;
				j++;
				flag2=cul1(data,x,j,num);
				flag3=cul4(data,i,y,num);
			}
			if(flag==3){
				i++;
				j--;
				flag2=cul2(data,x,j,num);
				flag3=cul3(data,i,y,num);
			}
			if(flag==4){
				i++;
				j++;
				flag2=cul2(data,x,j,num);
				flag3=cul4(data,i,y,num);
			}
			if(flag2==1 || flag3==1){
				break;
			}
		}
		if(lebel<10){
			num--;
		}
		return (num)*(num);
	}
	
	public static int cul1(int[][]data, int i, int j, int n){
		int flag=0;
		for(int x=0;x<n;++x){
			if(data[i-x][j]==1){
				flag=1;
			}
		}
		return flag;
	}
	
	public static int cul2(int[][]data, int i, int j, int n){
		int flag=0;
		for(int x=0;x<n;++x){
			if(data[i+x][j]==1){
				flag=1;
			}
		}
		return flag;
	}
	
	public static int cul3(int[][]data, int i, int j, int n){
		int flag=0;
		for(int y=0;y<n;++y){
			if(data[i][j-y]==1){
				flag=1;
			}
		}
		return flag;
	}

	public static int cul4(int[][]data, int i, int j, int n){
		int flag=0;
		for(int y=0;y<n;++y){
			if(data[i][j+y]==1){
				flag=1;
			}
		}
		return flag;
	}
}