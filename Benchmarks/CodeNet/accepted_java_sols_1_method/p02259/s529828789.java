import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
		int n=Integer.parseInt(br.readLine());
		int[] in=new int[n];
		int count=0;
StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) in[i]=Integer.parseInt(st.nextToken());
		
		for(int i=n;i>0;i--){
			for(int j=1;j<i;j++){
				if(in[j-1]>in[j]){count++;
					int tmp=in[j-1];
					in[j-1]=in[j];
					in[j]=tmp;
				}
			}
		}
StringBuilder stb=new StringBuilder(Integer.toString(in[0]));
for(int i=1;i<n;i++)stb.append(" "+in[i]);
System.out.println(stb);
		System.out.println(count);




	}

}