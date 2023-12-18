import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int result[]=new int[100000];
		int i=0,j=0;
		while(true){
			result[i]=scan.nextInt();
			if(result[i]==0){
				break;
			}
			i++;
		}
		for(j=0;j<i;j++){
			System.out.printf("Case %d: %d\n",j+1,result[j]);
		}
	}
} 