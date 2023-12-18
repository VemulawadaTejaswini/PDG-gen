import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true) {
			int max = 0;
			int count = 0;
			//int chackX =0;
			//int chackY =0;
			int n = scan.nextInt(); //??¨?????°
			if(n == 0) break;
			int w = scan.nextInt(); //???
			int h = scan.nextInt(); //??????
			boolean[][] field = new boolean[h][w];
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
				field[i][j] = false;
				}
			}
			
			for(int i=0;i<n;i++){
				int x = scan.nextInt()-1;
				int y = scan.nextInt()-1;
				field[y][x] = true;
			}
			/*
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(field[i][j] == false){
						System.out.print("0");
					}
					else{
						System.out.print("1");
					}
				}
				System.out.println("");
			}
			*/
			int s = scan.nextInt();
			int t = scan.nextInt();
			//System.out.println("s="+s);
			//System.out.println("t="+t);
			for(int i=0;i<=h-t;i++){
				for(int j=0;j<=w-s;j++){
					for(int k=i;k<t+i;k++){
						for(int l=j;l<s+j;l++){
							if(field[k][l] == true) count++;  
							//System.out.println(max);
							/*
							if(max < count){
								chackX =l;
								chackY =k;
							}
							*/
						}
					}
					if(max < count) max = count;
					
					count = 0;
				}
			}
			//System.out.println("x="+chackX);
			//System.out.println("y="+chackY);
			System.out.println(max);
		}
	}
}