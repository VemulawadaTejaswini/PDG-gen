import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	    long min = 0;
	    long max = 0;
	    long sum = 0;
		for(int i = 0; i<n; i++){
			long a = in.nextLong();
			//????°?????????¢?´¢
			for(int j = 0; j<n ;j++){
				if(a<min){
					min = a;
				}

				//?????§????????¢?´¢
				for(int k = 0; k<n; k++){
					if(a>max){
						max = a;
					}
				}
				for(int l = 0; l<n; l++){
					sum +=  a;
				}
			}

		}
		System.out.println(min+" "+max+" "+sum);
	}
}