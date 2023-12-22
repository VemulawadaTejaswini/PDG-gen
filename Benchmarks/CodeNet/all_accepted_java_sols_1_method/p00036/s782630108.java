import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int[][] map = new int[8][8];
			String t = "";
			for(int i=0;i<8;i++){
				t = sc.next();
				for(int j=0;j<8;j++){
					if(t.codePointAt(j)==49)map[i][j]=1;
				}
			}

			
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){
					if(map[i][j]==1){
						if(i==7){
							System.out.println("C");
						}else{
							if(i<6 && map[i+2][j]==1){
								System.out.println("B");
							}else if(j<6 && map[i][j+2]==1){
								System.out.println("C");
							}else if(i<6 && j!=0 && map[i+2][j-1]==1){
								System.out.println("D");
							}else if(i<6 && j!=7 && map[i+2][j+1]==1){
								System.out.println("F");
							}else if(map[i+1][j]==1 && map[i+1][j+1]==1){
								System.out.println("A");
							}else if(map[i+1][j]==1 && map[i+1][j+1]==0){
								System.out.println("G");
							}else{
								System.out.println("E");
							}
						}
						i=8;
						j=8;
		
					}					
				}
			}

		}
	}	
}