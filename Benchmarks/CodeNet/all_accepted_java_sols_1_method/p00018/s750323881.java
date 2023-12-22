import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=br.readLine())!=null){
			int[] nums = new int[5];
			for(int i=0;i<5;i++)
					nums[i] = Integer.parseInt(s.split(" ")[i]);
			Arrays.sort(nums);
			for(int i=4; i>0; i--)
				System.out.print(nums[i]+" ");
			System.out.println(nums[0]);
		}
    }
}