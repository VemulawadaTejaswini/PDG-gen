import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int[] tops=new int[3];
		int height;
		for(int h=0;h<10;h++){
			height=scan.nextInt();
			for(int i=0;i<tops.length;i++){
				if(tops[i]<height){
					for(int j=tops.length-1;i<j;j--){
						tops[j]=tops[j-1];
					}
					tops[i]=height;
					break;
				}
			}
		}
		scan.close();
		for(int i=0;i<tops.length;i++){
			System.out.println(tops[i]);
		}
	}
}