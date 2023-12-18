import java.util.Scanner; 
import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

class Main{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);	
		while(true){
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();

			//System.out.println(num1+" "+num2);

			if(num1==0&&num2==0){
				break;
			}

			int[] list = new int[21];

			String str = patting(num1,num2);		
			//System.out.println(str);
			list[0]=Integer.parseInt(str);

			boolean flag=false;

			for(int i=1;i<21;i++){
				str=patting(Integer.parseInt(str),num2);
				int max = maxNum(str);
				int min = minNum(str);
				int ans = max-min;			
				

				int count=0;
				for(int j=0;j<i;j++){
					if(list[j]==ans){
						System.out.println(count+" "+ans+" "+(i-count));
						flag=true;	
						break;
					}
					count++;
				}

				if(flag){
					break;
				}

				list[i]=ans;

				str=Integer.toString(ans);

			}
		}
	}

	static String patting(int num1,int num2){
		String[] str1 = Integer.toString(num1).split("");
		String[] patNum;

		StringBuilder build = new StringBuilder();

		//System.out.println(str1.length);

		if(num2!=str1.length-1){
			for(int i=0;i<=num2-str1.length;i++){
				build.append("0");	
			}

		}

		for(int i=0;i<str1.length;i++){
			build.append(str1[i]);	
		}

		return build.toString();
	}

	static int maxNum(String str){
		String[] nums = str.split("");	
		StringBuilder build = new StringBuilder();

		Arrays.sort(nums, Collections.reverseOrder());
		
		for(int i=0;i<nums.length;i++){
			build.append(nums[i]);		
		}

		return Integer.parseInt(build.toString());
	}

	static int minNum(String str){
		String[] nums = str.split("");	
		StringBuilder build = new StringBuilder();

		Arrays.sort(nums);

		for(int i=0;i<nums.length;i++){
			build.append(nums[i]);		
		}

		return Integer.parseInt(build.toString());
	}

}