import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=
		new BufferedReader(new InputStreamReader(System.in));
		
		String str1=br.readLine();
		String[] strs=str1.split(" ",3);
		int[] nums=new int[3];
		int num=0;
		for (int i=0;i<3;i++){
			nums[i]=Integer.parseInt(strs[i]);
		}
		num=nums[0];
		nums[0]=nums[1];
		nums[1]=num;
		num=nums[0];
		nums[0]=nums[2];
		nums[2]=num;
		System.out.print(nums[0]+" "+nums[1]+" " +nums[2]);
	}
}