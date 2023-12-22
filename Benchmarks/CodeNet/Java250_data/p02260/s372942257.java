import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		int[] in=new int[n];
		for(int i=0;i<n;i++)in[i]=Integer.parseInt(st.nextToken());
		
		int count=0;
		for(int i=0;i<n-1;i++){
			int mini=i;
			for(int j=i+1;j<n;j++){
				if(in[mini]>in[j]){
					mini=j;
				}
				}
			if(mini!=i){
				count++;
			int tmp=in[i];
			in[i]=in[mini];
			in[mini]=tmp;}
		}
		StringBuilder stb=new StringBuilder(Integer.toString(in[0]));
		for(int i=1;i<n;i++)stb.append(" "+in[i]);
		System.out.println(stb+"\r\n"+count);
		
	}

}