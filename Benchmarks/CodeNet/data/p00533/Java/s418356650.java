import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt(),W = sc.nextInt();
		int cnt=0,ccnt=0,i=0,j=0;
		String data[][] = new String[H][W];
		int ndata[][] = new int[H][W];
		for(i = 0;i < H;i++){
			for(j = 0;j < W;j++){
	    		data[i][j] = sc.next();
			}
		}
		for(i = 0;i < H;i++){
			for(j = 0;j < W;j++){
				if(data[i][j].equals(".")){
					if(ccnt != 1){
						ndata[i][j] = -1;
						/*if((j+1)==W){
							System.out.println(-1);
							ccnt = 0;
							cnt = 0;
						}else {
							System.out.print(-1+" ");
						//	System.out.print(" ");
						}*/

					}else{
						cnt++;
						ndata[i][j] = cnt;
						
						/*if((j+1)==W){
							cnt++;
							System.out.println(cnt);
							ccnt = 0;
		    				cnt = 0;
						}else{ 
							cnt++;
							System.out.print(cnt+" ");
							//System.out.print(" ");
						}*/
					}

				}
				else if(data[i][j].equals("c")){
					 cnt = 0;
	    			 ccnt = 1;
	    			 ndata[i][j] = 0;
	    			 /*if((j+1)==W){ 
	    				 System.out.println(0);
	    				 ccnt = 0; 
	    			 }else {
	    				 System.out.print(0+" ");
	    				// System.out.print(" ");
	    			 }*/
				}
				if((j+1) == W) ccnt = 0;
			}
		}
		for(i = 0;i < H;i++){
			for(j = 0;j < W;j++){
				if((j+1)==W){
					System.out.println(ndata[i][j]);
				}else{
					System.out.print(ndata[i][j]+" ");
				}
			}
		}
			
	}
}