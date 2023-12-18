import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
	
		int[] data =new int[10];
		
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		
		for(int i =0;i<10;i++){
			String str= buf.readLine();
			data[i]=Integer.parseInt(str);
		}
		
		for(int i=0;i<data.length-1;i++){
			int min=i;
			for(int j=i+1;j<data.length;j++){
				if(data[min]>data[j]){
					min=j;
				}
			}
			if(min != i){
					int tmp=data[min];
					data[min]=data[i];
					data[i]=tmp;
			}
		}
		
		System.out.println(data[9]);
		System.out.println(data[8]);
		System.out.println(data[7]);
	}
}