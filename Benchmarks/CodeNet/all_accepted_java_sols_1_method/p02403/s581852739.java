import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[]args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int H=0;
		int W=0;
		String[] arr;
		while((str=br.readLine())!=null){
			arr=str.split(" ");
			H=Integer.parseInt(arr[0]);
			W=Integer.parseInt(arr[1]);
			if((H==0)&&(W==0)){
				break;
			}
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					System.out.print("#");
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
		br.close();
	}
}