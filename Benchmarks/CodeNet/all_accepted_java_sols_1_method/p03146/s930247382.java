import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int sum=s,count=0;
		int[] array=new int[10000];
		array[0]=sum;
		do{
			count++;
			//System.out.println(sum);
			if(sum%2==0) {
				sum=sum/2;
			}else {
				sum=sum*3+1;
			}
			array[count]=sum;
			for(int i=0;i<=count-1;i++) {
				for(int j=i+1;j<=count;j++) {
					if(array[j]==array[i]) {
						System.out.println(count+1);
						System.exit(0);
					}
				}
			}
		}while(sum!=s);
	}
}

//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));


