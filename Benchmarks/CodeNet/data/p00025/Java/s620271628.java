import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Astr;
		String Bstr;

		while(true){
			int a[] = new int[4];
			int b[] = new int[4];

			if((Astr=br.readLine())==null)
				break;
			if((Bstr=br.readLine())==null)
				break;

			String aArray[] = Astr.split(" ");
			String bArray[] = Bstr.split(" ");

			for(int i=0; i<4; i++){
				a[i] = Integer.parseInt(aArray[i]);
				b[i] = Integer.parseInt(bArray[i]);
			}
			judge(a,b);
		}
	}

	static void judge(int a[],int b[]){
		int hit = 0;
		int blow = 0;

		for(int i=0; i<b.length; i++){
			for(int j=0; j<a.length; j++){
				if(b[i]==a[j]){
					if(i==j){
						hit++;
					}else{
						blow++;
					}
					break;
				}
			}
		}
		System.out.println(hit + " " + blow);
	}
}