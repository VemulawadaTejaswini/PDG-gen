import java.util.*;

public class Main{

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int p = sc.nextInt();
			int q = sc.nextInt();
			if((p|q) == 0)break;
			String [] data = new String[p];
			int [] datacount = new int[3];
			int [][] datacountrecord = new int[p][3];
			int [] indent = new int[p];
			for(int i = 0; i < p; i++){
				data[i] = sc.next();
				for(int j = 0; j < data[i].length(); j++){
					if(data[i].charAt(j) != '.'){
						break;
					}
					indent[i]++;
				}
				datacountrecord[i][0] = datacount[0];
				datacountrecord[i][1] = datacount[1];
				datacountrecord[i][2] = datacount[2];
				for(int j = 0; j < data[i].length(); j++){
					if(data[i].charAt(j) == '('){
						datacount[0]++;
					}
					else if(data[i].charAt(j) == '{'){
						datacount[1]++;
					}
					else if(data[i].charAt(j) == '['){
						datacount[2]++;
					}
					else if(data[i].charAt(j) == ')'){
						datacount[0]--;
					}
					else if(data[i].charAt(j) == '}'){
						datacount[1]--;
					}
					else if(data[i].charAt(j) == ']'){
						datacount[2]--;
					}
				}
			}
			String [] data2 = new String[q];
			int [] data2count = new int[3];
			int [][] data2countrecord = new int[q][3];
			for(int i = 0; i < q;i++){
				data2[i] = sc.next();
				data2countrecord[i][0] = data2count[0];
				data2countrecord[i][1] = data2count[1];
				data2countrecord[i][2] = data2count[2];
				for(int j = 0; j < data2[i].length(); j++){
					if(data2[i].charAt(j) == '('){
						data2count[0]++;
					}
					else if(data2[i].charAt(j) == '{'){
						data2count[1]++;
					}
					else if(data2[i].charAt(j) == '['){
						data2count[2]++;
					}
					else if(data2[i].charAt(j) == ')'){
						data2count[0]--;
					}
					else if(data2[i].charAt(j) == '}'){
						data2count[1]--;
					}
					else if(data2[i].charAt(j) == ']'){
						data2count[2]--;
					}
				}
			}
			
			int [] cand = new int[3];
			boolean first = true;
			boolean [] isNA = new boolean[q];
			for(int r = 1; r <= 20;r++){
				for(int c = 1; c <= 20; c++){
					for(int s = 1; s <= 20; s++){
						if(isvalid(r,c,s, datacountrecord, indent)){
							if(first){
								first = false;
								cand[0] = r;
								cand[1] = c;
								cand[2] = s;
							}
							else{
								int [] cand2 = {r,c,s};
								for(int i = 0; i < q; i++){
									if(isNA[i]) continue;
									int value1 = calc(data2countrecord[i], cand);
									int value2 = calc(data2countrecord[i], cand2);
									if(value1 != value2){
										isNA[i] = true;
									}
								}
							}
						}
					}
				}
			}
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < q; i++){
				if(isNA[i]){
					sb.append(" " + -1);
				}
				else{
					int value = calc(data2countrecord[i], cand);
					sb.append(" " + value);
				}
			}
			System.out.println(sb.substring(1));
		}
	}

	private int calc(int[] count, int[] cand) {
		int sum = 0;
		for(int i = 0; i < 3; i++){
			if(count[i] > 0 && cand[i] <= 0){
				return -1;
			}
			sum += count[i] * cand[i];
		}
		return sum;
	}

	private boolean isvalid(int r, int c, int s, int [][] data, int [] indent) {
		for(int i = 0; i < indent.length; i++){
			if(indent[i] == (r * data[i][0] + c * data[i][1] + s * data[i][2])){
				
			}
			else{
				return false;
			}
		}
		return true;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}