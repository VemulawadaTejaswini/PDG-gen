import java.io.*;
public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String str=input.readLine();
		String str2=input.readLine();
		String[] atr=str2.split(" ");
		int n=Integer.parseInt(str);
		int[] number =new int[n];
		for(int i=0;i<atr.length;i++){
		number[i]=Integer.parseInt(atr[i]);
		}
		int min=number[0];
		int max=number[0];
		int sum=0;
		for(int i=0;i<number.length;i++){
			if(min>number[i]){
				min=number[i];
			}
		}
		for(int i=0;i<number.length;i++){
			if(max<number[i]){
				max=number[i];
			}
		}
		for(int i=0;i<number.length;i++){
			sum+=number[i];
		}
		System.out.println(min+" "+max+" "+sum);	
		
	}
}