import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int length=(int)Math.pow(10,7);
		int S[]=new int[length];
		int count=0;
		for(int i=0;i<length;i++){
			S[i]=0;
		}
		int slength=sc.nextInt();
		for(int j=0;j<slength;j++){
			int ss=sc.nextInt();
			S[ss]++;
		}
		int tlength=sc.nextInt();
		for(int k=0;k<tlength;k++){
			int tt=sc.nextInt();
			S[tt]++;
		}
		for(int i=0;i<length;i++){
			if(S[i]>1){
				count++;
			}
			
		}
		System.out.println(count);
	}

}