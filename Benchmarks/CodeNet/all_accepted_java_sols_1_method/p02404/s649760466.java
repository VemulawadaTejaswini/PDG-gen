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
			for(int i=1;i<=H;i++){
				for(int j=1;j<=W;j++){
					if((i==1)||(i==H)||(j==1)||(j==W)) System.out.print("#");
					else System.out.print(".");
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
		br.close();
	}
}