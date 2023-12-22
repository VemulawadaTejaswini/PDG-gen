import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int length = s.length();
		int[] ans = new int[100000];

		int Rs = 0;
		int Ls = 0;
		int changeid = -1;
		Boolean flag = true;

		for(int i = 0 ; i < length-1 ; i++){
			if(flag){
				if(s.charAt(i) == 'R'){
					Rs++;
				}else{
					Ls++;
					changeid = i-1;
					flag = false;
				}
			}else{
				if(s.charAt(i) == 'R'){

					if(((Rs+Ls)&1) == 0){
						ans[changeid] = (Rs+Ls)/2;
						ans[changeid+1] = (Rs+Ls)/2;
					}else{
						if((Rs&1) == 0){
							ans[changeid] = (Rs+Ls-1)/2;
							ans[changeid+1] = (Rs+Ls+1)/2;
						}else{
							ans[changeid] = (Rs+Ls+1)/2;
							ans[changeid+1] = (Rs+Ls-1)/2;
						}
					}

					Rs = 0;
					Ls = 0;
					flag = true;
					changeid = i;
					Rs++;
				}else{
					Ls++;
				}
			}
		}

		{
			Ls++;
			if(flag){
				changeid = length-2;
			}else{

			}
			if(((Rs+Ls)&1) == 0){
				ans[changeid] = (Rs+Ls)/2;
				ans[changeid+1] = (Rs+Ls)/2;
			}else{
				if((Rs&1) == 0){
					ans[changeid] = (Rs+Ls-1)/2;
					ans[changeid+1] = (Rs+Ls+1)/2;
				}else{
					ans[changeid] = (Rs+Ls+1)/2;
					ans[changeid+1] = (Rs+Ls-1)/2;
				}
			}
		}
		StringBuilder val = new StringBuilder();
		for(int i = 0 ; i < length-1 ; i++){
			val.append(""+ans[i]+" ");
		}
		val.append(""+ans[length-1]);
		System.out.println(new String(val));
	}

}