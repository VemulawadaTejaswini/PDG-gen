import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int num, key;
		String str;
		String[] str_array;
		try{
		num=Integer.parseInt(reader.readLine());
		str=reader.readLine();
		str_array=str.split(" ");

		int[] array=new int[num];
		for(int i=0;i<num;i++){
			array[i]=Integer.parseInt(str_array[i]);
		}

		for(int i=0;i<num;i++){
			key=array[i];
			int j=i-1;
			while(j>=0&&array[j]>key){
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=key;

			for(int k=0;k<num;k++){
				System.out.print(array[k]);
				if(k!=num-1)System.out.print(" ");
			}
			System.out.println();
		}


		}catch(IOException e){
			//????????????
		}


	}

}