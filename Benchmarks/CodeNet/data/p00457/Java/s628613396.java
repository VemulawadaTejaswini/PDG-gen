
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static int product4(int[] a){
		return a[0]*a[1]*a[2]*a[3];
	}

	public static int puyo(int[] a){
		int answer = a.length;
		boolean flag = true;
		while(flag&&answer>=4){
			for (int i=0;i<answer-3;i++){
				flag = false;
				if(a[i] == a[i+1] &&a[i] == a[i+2] &&a[i] == a[i+3]){
					int hit = a[i];
					int ren = 3;
					while(i+ren+1 < answer){
						if(a[i+ren+1] != hit){break;}
						ren++;
					}
					for(int j=i; j<answer-ren-1; j++){
						a[j] = a[j+ren+1];
					}
					answer -= ren+1;
					flag = true;
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int n = Integer.parseInt(br.readLine());
			if(n==0){break;}

			int[] cha = new int[n];
			for (int i=0; i<n; i++){
				cha[i] = Integer.parseInt(br.readLine());
			}
			int answer = n;
			for(int i=0;i<n-3;i++){
				int[] chain = new int[n];
				for(int j=0; j<n; j++){
					chain[j]=cha[j];
				}
				int pro = product4(Arrays.copyOfRange(chain, i, i+4));
				if(pro==2 || pro==3|| pro==8|| pro==24|| pro==27|| pro==54){
					int hit = chain[i];
					if (hit == chain[i+1]){
						chain[i+2] = chain[i+3] = hit;
					}else if(hit == chain[i+2]){
						chain[i+1] = hit;
					}else{
						chain[i] = chain[i+1];
					}
					answer = Math.min(answer, puyo(chain));
				}
			}
			System.out.println(answer);
		}
	}
}