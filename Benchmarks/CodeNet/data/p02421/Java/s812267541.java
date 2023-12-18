import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int point[] = {0,0};
		for(int i = 0 ; i < num ; i++){
			String str[] = br.readLine().split(" ");
			if(str[0].compareToIgnoreCase(str[1])>0){
				point[0]+=3;
			}
			else if(str[0].compareToIgnoreCase(str[1])<0){
				point[1]+=3;
			}
			else if(str[0].compareToIgnoreCase(str[1])==0){
				point[0]++;
				point[1]++;
			}
		}
		System.out.println(point[0]+" "+point[1]);

	}

}