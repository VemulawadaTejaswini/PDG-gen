import java.util.*;
 class Main {
	public static void main(String[] args){
		int a[]=new int[10];
		Scanner x=new Scanner(System.in);
		for(int i=0;i<10;i++){
			a[i]=x.nextInt();
		}
		Arrays.sort(a);
		x.close();
		for(int j=9;j>=7;j--)
			System.out.println(a[j]);
	}
	

}