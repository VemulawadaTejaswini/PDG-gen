import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[] = new int[20000],i=0;
		while((a[i]=Integer.parseInt(br.readLine()))!=0){
			i++;
		}
		int j;
		for(j=1;j<=i;j++){
			System.out.println("Case "+j+": "+a[j-1]);;
		}
	}
}