import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str,strArray[];

		while((str=br.readLine()) != null){
			int index[] = new int[14];
			int count=0;
			boolean judge=false;
			strArray = str.split(",");

			for(String s:strArray){
				count = Math.max(count, ++index[Integer.parseInt(s)]);
			}

			if(count==4){
				System.out.println("four card");
			}
			else if(count==3){
				for(int i=0; i<14; i++){
					if(index[i]==2){
						judge=true;
						break;
					}
				}
				System.out.println(judge ? "full house" : "three card");
			}
			else if(count==2){
				int c=0;
				for(int i=0; i<14; i++){
					if(index[i]==2){
						c++;
					}
				}
				System.out.println(c==2 ? "two pair" : "one pair");
			}
			else{
				if(index[1]==1 && index[10]==1 &&index[11]==1 && index[12]==1 && index[13]==1){
					System.out.println("straight");
				}else{
					int i=0;
					for(i=0; i<14; i++){
						if(index[i]==1){
							judge=true;
							break;
						}
					}

					for(int j=i; j<i+5; j++){
						if(index[j] != 1){
							judge=false;
						}
					}
					System.out.println(judge ? "straight" : "null");
				}
			}
		}
	}
}