import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt();
		int b=stdIn.nextInt();
		int c=stdIn.nextInt();
		int[] array={a,b,c};
		for(int i=0;i<2;i++){
			for(int j=2;j>i;j--){
				if(array[j-1]>array[j]){
					int tmp=array[j];
					array[j]=array[j-1];
					array[j-1]=tmp;
				}
			}
		}
		System.out.println(array[0]+" "+array[1]+" "+array[2]);
	}
}