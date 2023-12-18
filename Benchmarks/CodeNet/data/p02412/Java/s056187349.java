//????????????????????°???????????????????????°??????
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		//??\?????????????????°
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			
			String[] str = br.readLine().split(" ");
			
			int limitNum = Integer.parseInt(str[0]);
			int sumNum = Integer.parseInt(str[1]);
			
			if(limitNum == 0 && sumNum==0) {
				break;
			}
			
			int cnt = 0;
			
			for(int i=1; i<=limitNum-2; i++) {
				for(int j=i+1; j<=limitNum-1; j++) {
					for(int k=j+1; k<=limitNum; k++) {
						if(i+j+k == sumNum) {
							cnt++;
						}
					}
				}
			}
			sb.append(cnt+"\n");
		}
		System.out.print(sb.toString());
	}


}