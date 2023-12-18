import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int cnt=0;
		int ccnt=0;
		String data[][] = new String[H][W];
		for(int i = 0;i < H;i++){
			for(int k = 0;k < W;k++){
	    		data[i][k] = sc.next();
			}
		}
		for(int i = 0;i < H;i++){
			for(int k = 0;k < W;k++){
				if(data[i][k].equals(".")){
					if(ccnt != 1){
						if((k+1)==W){
							System.out.println(-1);
							//System.out.print(" ");
							ccnt = 0;
							cnt = 0;
						}else {
							System.out.print(-1);
							System.out.print(" ");
						}

					}else{
						if((k+1)==W){
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
				else if(data[i][k].equals("c")){
					 cnt = 0;
	    			 ccnt = 1;
	    			 if((k+1)==W){ 
	    				 System.out.println(0);
	    			//	 System.out.println(" ");
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