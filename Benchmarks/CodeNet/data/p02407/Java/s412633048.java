import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[]args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String[] arr;
		int n=0;
		
		while((str=br.readLine())!=null){
			if(n==0){
				n=Integer.parseInt(str);
				continue;
			}
			arr=str.split(" ");
			int[] array=new int[n];
			for(int i=0;i<n;i++){
				array[i]=Integer.parseInt(arr[i]);
			}
			for(int i=0;i<n-(i+1);i++){
				for(int j=1;j<n;j++){
					if(array[i]<array[j]);
					else {
						int temp=array[j];
						array[j]=array[i];
						array[i]=temp;
					}
				}
			}
			for(int i=0;i<n;i++){
				System.out.print(array[n-(i+1)] +" ");
			}
			System.out.print("\n");
			break;
		}
		br.close();
	}
}