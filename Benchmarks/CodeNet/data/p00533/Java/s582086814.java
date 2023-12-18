import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(),W = sc.nextInt();
		int cnt=0,ccnt=0,i,j;
		String data[][] = new String[50][50];
		for(i = 0;i < H;i++){
			for(j = 0;j < W;j++){
	    		data[i][j] = sc.next();
			}
		}
		for(i = 0;i < H;i++){
			for(j = 0;j < W;j++){
				if(data[i][j].equals(".")){
					if(ccnt != 1){
						if((j+1)==W){
							System.out.println(-1);
							ccnt = 0;
							cnt = 0;
						}else {
							System.out.print(-1);
							System.out.print(" ");
						}

					}else{
						if((j+1)==W){
							cnt++;
							System.out.println(cnt);
							ccnt = 0;
		    				cnt = 0;
						}else{ 
							cnt++;
							System.out.print(cnt);
							System.out.print(" ");
						}
					}
				}
				else if(data[i][j].equals("c")){
					 cnt = 0;
	    			 ccnt = 1;
	    			 if((j+1)==W){ 
	    				 System.out.println(0);
	    				 ccnt = 0; 
	    			 }else {
	    				 System.out.print(0);
	    				 System.out.print(" ");
	    			 }
				}
			}
		}
	}
}