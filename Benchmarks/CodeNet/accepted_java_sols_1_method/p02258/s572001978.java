import java.util.Scanner;

public class Main{


	public static void main(String[] args){

		int n;

		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		int[] box=new int[n];
		int max=-1000000001;
		int min=1000000001;

		for(int i=0;i<n;i++){
		box[i]=scan.nextInt();
		}

		for(int i=0;i<n-1;i++){

			if(min>box[i]){
			for(int j=i+1;j<n;j++){
				if(box[j]-box[i]>0&&min>box[i])min=box[i];
				if(max<box[j]-box[i])max=box[j]-box[i];
			}
			}//if(min>box[i])
		}
		System.out.println(max);



		scan.close();

	}

}