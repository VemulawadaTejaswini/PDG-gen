import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++){
			
						
			String[] tmpArray = br.readLine().split(" ");
			int y = Integer.parseInt(tmpArray[0]);
			int m = Integer.parseInt(tmpArray[1]);
			int d = Integer.parseInt(tmpArray[2]);
			
			int day = 0;
			while(true){
				boolean addMonth = false;
				//??§???????????????
				if(d == 20){
					d = 1;
					addMonth = true;
				}
				//?°????????????????
				else if(d == 19 && y%3 != 0 && m%2 == 0){
					d = 1;
					addMonth = true;
				}
				else {
					d++;
				}
				
				if(addMonth){
					if(m == 10){
						m = 1;
						y++;
					}
					else {
						m++;
					}
				}
				
				day++;
				//System.out.println("day "+ day);
				
				if(y == 1000 && m == 1 && d == 1){
					System.out.println(day);
					break;
				}
			}
		}
	}

}