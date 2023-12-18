import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h,w;
		String[] temp = new String[1024];
		String[][] area = new String[10][1024];
		int i,j;
		int x = 0;
		boolean flag = true;
		boolean endflag = false;
		boolean startflag = true;
		h = sc.nextInt();
		w = sc.nextInt();
		for (i = 0;i < h ;i++ ) {
			temp[i] = sc.next();
		}
		for (i = 0;i<h ;i++) {
			for (j=0;j<w;j++) {
				area[i][j] = String.valueOf(temp[i].charAt(j));
			}
		}
		for (i = 0;i < h ;i++ ) {
			startflag = false;
			endflag =false;
			for (j = 0;j < w ;j++ ) {
				if(flag == false){
					break;
				}
				else if(area[i][j].equals("#")){
					if(endflag){
						flag = false;
					}
					else if(!startflag){
						if(j<x){
							flag = false;
						}
						else{
							startflag = true;
						}
					}
					else{
						x++;
					}
				}
				else if(area[i][j].equals(".")){
					if(startflag){
						endflag = true;
					}
				}
			}
		}
	

		if(flag){
			System.out.println("Possible");
		}
		else{
			System.out.println("Impossible");
		}
	}
}