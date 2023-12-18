import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		while((str=br.readLine()) != null){
			char cArray[] = str.toCharArray();
			int nArray[] = new int[cArray.length];
			int result=0;

			for(int i=0; i<cArray.length; i++){
				nArray[i] = Numbering(cArray[i]);
			}

			for(int i=0; i<nArray.length; i++){
				if((i>0) && nArray[i-1]<nArray[i]){
					nArray[i-1] *= -1;
				}
			}

			for(int i:nArray){
				result += i;
			}

			System.out.println(result);
		}
	}

	static int Numbering(char c){
		int n=0;

		switch (c){
		case 'I':
			n=1;
			break;
		case 'V':
			n=5;
			break;
		case 'X':
			n=10;
			break;
		case 'L':
			n=50;
			break;
		case 'C':
			n=100;
			break;
		case 'D':
			n=500;
			break;
		case 'M':
			n=1000;
		}
		return n;
	}
}