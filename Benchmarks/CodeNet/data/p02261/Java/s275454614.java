import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		 BufferedReader br = new BufferedReader(new
		 InputStreamReader(System.in));
		//BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] bubble = new String[n];
		String[] select = new String[n];
		for (int i = 0; i < n; i++) {
			String str = st.nextToken();
			bubble[i] = str;
			select[i] = str;
		}
		boolean con=true;
		bubblesort(bubble);
		selectsort(select);
		StringBuilder stb1 = new StringBuilder(bubble[0]);
		StringBuilder stb2 = new StringBuilder(select[0]);
		for (int i = 1; i < n; i++){
			stb1.append(" " + bubble[i]);
			stb2.append(" " + select[i]);
			if(con&&!(bubble[i].equals(select[i]))) con=false;
				}
		System.out.println(stb1+"\r\n"+"Stable");			
		System.out.println(stb2+"\r\n"+(con?"Stable":"Not stable"));

	}

	static void bubblesort(String[] in) {
		int count = 0;
		for (int i = in.length; i > 0; i--) {
			for (int j = 1; j < i; j++) {

				if (in[j - 1].charAt(1) > in[j].charAt(1)) {
					count++;
					String tmp = in[j - 1];
					in[j - 1] = in[j];
					in[j] = tmp;
				}
			}
		}
		
	}

	static void selectsort(String[] in) {
		int count=0;
		for(int i=0;i<in.length-1;i++){
			int mini=i;
			for(int j=i+1;j<in.length;j++){
				if(in[mini].charAt(1)>in[j].charAt(1)){
					mini=j;
				}
				}
			if(mini!=i){
				count++;
			String tmp=in[i];
			in[i]=in[mini];
			in[mini]=tmp;}
		}}
}