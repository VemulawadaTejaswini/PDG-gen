import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	public static void main(String[] args) throws IOException {
	
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true){
			String line = input.readLine();
			String[] num = line.split(" ");
			int tate = Integer.parseInt(num[0]);
			int yoko = Integer.parseInt(num[1]);
			int count = 0;
			if(tate==0 && yoko==0) break;
			
			for(int i = 1 ; i <= tate ; i++){
				for(int j = 1 ; j <= yoko ; j++){
				if(i % 2 != 0){
					if(j % 2 != 0) sb.append("#");
					else sb.append(".");
					if(j%yoko==0) sb.append("\n");
				    }
				else{
					if(j % 2 != 0) sb.append(".");
					else sb.append("#");
					if(j%yoko==0) sb.append("\n");
				    }
				}
			}
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
}