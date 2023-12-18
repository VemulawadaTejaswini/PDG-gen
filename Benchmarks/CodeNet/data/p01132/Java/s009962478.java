import java.util.*;

public class Main{
	int [] table = {10, 50, 100, 500};

	private void doit(){
		Scanner sc = new Scanner(System.in);
		boolean isfirst = true;
		while(true){
			
			int value = sc.nextInt();
			if(value == 0) break;
			if(isfirst){
				isfirst = false;
			}
			else{
				System.out.println();
			}
			int [] num = new int[4];
			for(int i = 0; i < 4; i++){
				num[i] = sc.nextInt();
			}
			int min = 1 << 24;
			int [] ans = new int[4];
			for(int i = 0; i <= num[0]; i++){
				for(int j = 0; j <= num[1]; j++){
					for(int k = 0; k <= num[2]; k++){
						for(int m = 0; m <= num[3]; m++){
							int nowvalue = i * 10 + j * 50 + k * 100 + m * 500;
							
							if(value <= nowvalue){
								int nowdiff = nowvalue - value;
								int count = 0;
								for(int ii = table.length - 1; ii >= 0; ii--){
									while(nowdiff >= table[ii]){
										count++;
										nowdiff -= table[ii];
									}
								}
								if(min >count){
									min = count;
									ans[0] = i;
									ans[1] = j;
									ans[2] = k;
									ans[3] = m;
								}
							}
						}
					}
				}
			}
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < 4; i++){
				if(ans[i] > 0){
					sb.append(table[i] + " " + ans[i] + "\n");
				}
			}
			System.out.print(sb.toString());
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}