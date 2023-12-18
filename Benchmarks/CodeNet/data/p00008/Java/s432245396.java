import java.util.Scanner;

class Main{
    public static void main(String[] args){
	final Scanner sc=new Scanner(System.in);
	int[] sum=new int[51];
	for(int i=0;i<51;i++)sum[i]=0;
	for(int i=0;i<=9;i++)
	    for(int j=0;j<=9;j++)
		for(int k=0;k<=9;k++)
		    for(int l=0;l<=9;l++)
			sum[i+j+k+l]++;
	while(sc.hasNext()){
	    System.out.println(sum[sc.nextInt()]);
	}
    }
}