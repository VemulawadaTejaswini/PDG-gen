
import java.util.*;

public class Main {

	private void doit() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.next();
			int [][] data = new int[3][3];
			for(int i = 0; i < str.length(); i++){
				int iind = i / 3;
				int jind = i % 3;
				char c = str.charAt(i);
				switch(c){
				case 'o':
					data[iind][jind] = 1;
					break;
				case 'x':
					data[iind][jind] = 0;
					break;
				case 's':
					data[iind][jind] = -1;
				}
			}
			String ans = "";
			if(data[0][0] == data[1][0]  && data[1][0] == data[2][0]){
				if(data[0][0] == 0){
					ans = "x";
				}
				else if (data[0][0] == 1){
					ans = "o";
				}
			}
			if(data[0][0] == data[0][1]  && data[0][1] == data[0][2]){
				if(data[0][0] == 0){
					ans = "x";
				}
				else if(data[0][0] == 1){
					ans = "o";
				}
			}
			if(data[0][2] == data[1][2]  && data[1][2] == data[2][2]){
				if(data[2][2] == 0){
					ans = "x";
				}
				else if(data[2][2] == 1){
					ans = "o";
				}
			}
			if(data[2][0] == data[2][1]  && data[2][1] == data[2][2]){
				if(data[2][2] == 0){
					ans = "x";
				}
				else if(data[2][2] == 1){
					ans = "o";
				}
			}
			if(data[0][0] == data[1][1]  && data[1][1] == data[2][2]){
				if(data[2][2] == 0){
					ans = "x";
				}
				else if(data[2][2] == 1){
					ans = "o";
				}
			}
			if(data[0][2] == data[1][1]  && data[1][1] == data[2][0]){
				if(data[0][2] == 0){
					ans = "x";
				}
				else if(data[0][2] == 1){
					ans = "o";
				}
			}
			if(data[1][0] == data[1][1]  && data[1][1] == data[1][2]){
				if(data[1][1] == 0){
					ans = "x";
				}
				else if(data[1][1] == 1){
					ans = "o";
				}
			}
			if(data[0][1] == data[1][1]  && data[1][1] == data[2][1]){
				if(data[1][1] == 0){
					ans = "x";
				}
				else if(data[1][1] == 1){
					ans = "o";
				}
			}
			if(ans.length() == 0){
				ans = "d";
			}
			System.out.println(ans);
		}
		
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}