import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int n;
		String[] strarr;
		int[] arr;
		int i, j, l, t;
		try{
			n = Integer.parseInt(reader.readLine());
			line = reader.readLine();
			strarr = line.split(" ");
			arr = new int[n];
			for(i=0, l=strarr.length; i<l; i++){
				arr[i] = Integer.parseInt(strarr[i]);
			}
			//???????????????
			for(i=0, l=arr.length; i<l; i++){
				for(j=i+1; j<l; j++){
					if(arr[i] > arr[j]){
						t = arr[i];
						arr[i] = arr[j];
						arr[j] = t;
					}
				}
			}
			//??????
			for(i=0, l=arr.length; i<l; i++){
				if(i!=0)System.out.printf(" ");
				System.out.printf(""+arr[i]);
			}
			System.out.printf("\n");
		}catch(IOException e){
			System.out.println(e);
		}
	}
	
}