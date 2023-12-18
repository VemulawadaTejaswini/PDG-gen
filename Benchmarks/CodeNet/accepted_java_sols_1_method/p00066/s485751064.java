import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<String> ans = new ArrayDeque<String>();

		while(sc.hasNext()){
			String s = sc.next();
			int[][] map = new int[3][3];
			
			int n = 0;
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					String t = s.substring(n,n+1);
					if(t.compareTo("o")==0){
						map[i][j]=1;
					}else if(t.compareTo("x")==0){
						map[i][j]=2;
					}
					n++;
				}	
			}
			n=0;
			int count=0;
			for(int i=1;i<=2;i++){
				for(int j=0;j<3;j++){
					count=0;
					for(int k=0;k<3;k++){
						if(map[j][k]==i)count++;
					}
					if(count==3){
						n=i;
						j=3;
					}
				}
				for(int j=0;j<3;j++){
					count=0;
					for(int k=0;k<3;k++){
						if(map[k][j]==i)count++;
					}
					if(count==3){
						n=i;
						j=3;
					}
				}
				if(map[1][1]==i){
					if((map[0][0]==i && map[2][2]==i) || (map[0][2]==i && map[2][0]==i))n=i;
				}
				if(n!=0)i=3;
			}

			if(n==0){
				ans.push("d");
			}else if(n==1){
				ans.push("o");
			}else{
				ans.push("x");
			}
		}
		int num = ans.size();
		for(int i=0;i<num;i++){
			System.out.println(ans.pollLast());
		}
	}
}