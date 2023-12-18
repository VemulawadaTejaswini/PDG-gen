import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		int n = Integer.parseInt(br.readLine());
		for(int k = 0; k < n; k++){
			String str1 = br.readLine();
			String str2 = br.readLine();
			if(str1.length() > 79 || str2.length() > 79){
				System.out.println("overflow");
				continue;
			}
			int len1 = (str1.length()-1)/9 +1;
			int len2 = (str2.length()-1)/9 +1;
			
			int arr1[] = new int[len1];
			int arr2[] = new int[len2];
			for(int i = 0; i < len1; i++){
				if(i == len1-1){
					arr1[i] = Integer.parseInt(str1.substring
					(0, (str1.length()-9*i)));
				}
				else{
					arr1[i] = Integer.parseInt(str1.substring
					(str1.length()-9*(i+1)
					, str1.length()-9*i));
				}

			}

			for(int i = 0; i < len2; i++){
				if(i == len2-1){
					arr2[i] = Integer.parseInt(str2.substring
					(0, (str2.length()-9*i)));
				}
				else{
					arr2[i] = Integer.parseInt(str2.substring
					(str2.length()-9*(i+1)
					, str2.length()-9*i));
				}

			}

			int max;
			int min;
			if(len1 > len2){
				max = len1;
				min = len2;
			}
			else{
				max = len2;
				min = len1;
			}
			int[] sum = new int[max+1];
			for(int i = 0; i < min; i++){
				sum[i] = arr1[i] + arr2[i];
				if(sum[i] > 999999999){
					sum[i+1]++;
					sum[i] -= 1000000000;
				}


			}
			for(int i = min; i < max; i++){
				if(max == len1)
					sum[i] += arr1[i];
				else
					sum[i] += arr2[i];
				if(sum[i] > 999999999){
					sum[i+1]++;
					sum[i] -= 1000000000;
				}


			}

			

			if(sum[max] != 0)
				System.out.print(sum[max]);
			for(int i = 1; i < max+1; i++){
				
				if(sum[max] == 0 && i == 1){
					System.out.print(sum[max-i]);
				}
				else
					System.out.print(String.format("%1$09d", sum[max-i]));
			}
			System.out.println();
		}
	}
}