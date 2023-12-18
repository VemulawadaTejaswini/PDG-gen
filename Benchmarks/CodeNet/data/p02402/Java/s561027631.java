import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{


	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		try{
			int n=scan.nextInt();

			String s=reader.readLine();
			String[] str =s.split(" ");
			int array_num[]= new int[n];
			int max, min, sum;
			sum=0;
			max=Integer.MIN_VALUE;
			min=Integer.MAX_VALUE;

			for(int i=0;i<n;i++){
				array_num[i]=Integer.parseInt(str[i]);
				sum+=array_num[i];

				if(array_num[i]>max)max=array_num[i];
				if(array_num[i]<min)min=array_num[i];
			}

			System.out.println(min+" "+max+" "+sum);




			reader.close();
		}catch(IOException e){
			System.out.println("??¨??????:"+e);

		}

	}

}