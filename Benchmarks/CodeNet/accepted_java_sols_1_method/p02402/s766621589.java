import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[]args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n=0;
		String[] arr;
		int[] array;
		int min=0;
		int max=0;
		long sum=0;
		while((str=br.readLine())!=null){
			if(n == 0){
				n=Integer.parseInt(str);
				continue;
			}
			arr=str.split(" ");
			array = new int[n];
			for(int i=0;i<n;i++){
				array[i]=Integer.parseInt(arr[i]);
				sum+=array[i];
			}
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++) {
					if(array[i] <= array[j]);
					else{
						int temp = array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
			}

			min=array[0];
			max=array[n-1];
			System.out.println(min+" "+max+" "+sum);
			
		}		
		br.close();
	}
}