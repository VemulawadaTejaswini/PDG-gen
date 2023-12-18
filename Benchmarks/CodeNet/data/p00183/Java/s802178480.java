import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String[] s = new String[3];
			s[0] = sc.next();
			if(s[0].compareTo("0")==0)break;
			s[1] = sc.next();
			s[2] = sc.next();
			int[][] map = new int[3][3];
			
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					String t = s[i].substring(j,j+1);
					if(t.compareTo("b")==0){
						map[i][j] = 1;
					}else if(t.compareTo("w")==0){
						map[i][j] = 2;
					}
				}
			}
			
			int count;
			int ans = 0;
			for(int k=1;k<3;k++){
				for(int i=0;i<3;i++){
					count = 0;
					for(int j=0;j<3;j++){
						if(map[i][j]==k)count++;
					}
					if(count==3){
						ans=k;
						break;
					}
				}
				for(int i=0;i<3;i++){
					count = 0;
					for(int j=0;j<3;j++){
						if(map[j][i]==k)count++;
					}
					if(count==3){
						ans=k;
						break;
					}
				}
				
				if(map[1][1]==k){
					if((map[0][2]==k && map[2][0]==k) || (map[0][0]==k && map[2][2]==k))ans=k;
				}
	
			}
			
			if(ans==1){
				System.out.println("b");
			}else if(ans==2){
				System.out.println("w");
			}else{
				System.out.println("NA");
			}
			
		}
	}	
}