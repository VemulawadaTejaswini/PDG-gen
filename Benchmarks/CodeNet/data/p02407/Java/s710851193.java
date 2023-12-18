import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{


	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));


		try{
		int n=Integer.parseInt(reader.readLine());//n?????????
		String text=reader.readLine();


		String[] num_array=text.split(" ");
		int[] num_array_int=new int[num_array.length];

		for(int i=0;i<num_array.length;i++){
			num_array_int[i]=Integer.parseInt(num_array[i]);
		}

		swap(num_array_int);

		for(int i=0;i<n;i++){
			System.out.print(num_array_int[i]);
			if(i!=n-1){System.out.print(" ");}
		}System.out.println();
		reader.close();

		}catch(IOException e){
			System.out.println("??¨??????"+e);
		}

	}

	//????????????????????\?????????????????????????????????
	public static void swap(int x[]){
		//????????????????????????
		int len=x.length;
		int a;
		for(int i=0;i<(len/2);i++){
			a=x[i];
			x[i]=x[(len-1)-i];
			x[(len-1)-i]=a;
		}


	}

}