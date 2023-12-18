import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str,hit="HIT",hr="HOMERUN",out="OUT";

		for(int i=0; i<n; i++){
			boolean runner[] = new boolean[3];
			int score=0;
			int outCount=0;
			while((str=br.readLine()) != null){
				if(str.equals(out)){
					outCount++;
					if(outCount==3)
						break;
				}else if(str.equals(hit)){
					if(runner[2]){
						score++;
					}
					runner[2]=runner[1];
					runner[1]=runner[0];
					runner[0]=true;
				}else if(str.equals(hr)){
					score++;
					for(int j=0; j<n; j++){
						if(runner[i]){
							score++;
							runner[i]=false;
						}
					}
				}
			}
			System.out.println(score);
		}
	}
}