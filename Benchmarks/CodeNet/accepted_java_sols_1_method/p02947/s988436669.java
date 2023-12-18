import java.util.Scanner;
import java.util.Arrays;

public class Main{

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] line=new String[n];
		char s[][]=new char[n][10];

		for(int i=0;i<n;i++){
			s[i]=sc.next().toCharArray();
			Arrays.sort(s[i]);
		}

		for(int i=0;i<n;i++){
			line[i]=String.valueOf(s[i]);
		}

		int count=0;
		long usagi=0;


		Arrays.sort(line);


		for(int i=0;i<n-1;i++){
			if(line[i].equals(line[i+1])){
				count++;
				usagi+=count;
			}else{
				count=0;
			}
		}


		System.out.println(usagi);

	}
}
