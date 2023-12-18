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
			
			for(int i=0;i<n-1;i++){
				for(int j=n-1;j>i;j--){
					if(array[j]<array[j-1]){
						int temp = array[j];
						array[j]=array[j-1];
						array[j-1]=temp;
					}
				}
			}

			for(int i=0;i<n;i++){
				System.out.print(array[i] +" ");
			}
			System.out.print("\n");
			break;
		}
		System.out.println("\n");
		br.close();
	}
}