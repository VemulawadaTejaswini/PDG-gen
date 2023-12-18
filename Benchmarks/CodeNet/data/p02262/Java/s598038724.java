import java.util.Scanner;

public class Main{

	public static int insertionSort(int[] array, int n, int g){
		int cnt=0;

		for(int i=g;i<n;i++){
			int j;
			int tmp=array[i];
			for(j=i-g;j>=0&&array[j]>tmp;j-=g){
				array[j+g]=array[j];
			    cnt++;}
			array[j+g]=tmp;
		}
		return cnt;
	}

	public static void shellSort(int[] array, int n){
		int cnt=0;
		int[] G=new int[15];
		int g, i, m;
		m=0;

		for(g=1;g<=n;g=g*3+1){G[m]=g;m++;}

		//???????????°???i?????\?????????????????????
		System.out.println(m);//???????????°
		for(int j=m-1;j>=0;j--){
		System.out.print(G[j]);
		if(j!=0)System.out.print(" ");
		}System.out.println();

		for(i=m-1;i>=0;i--){
			cnt+=insertionSort(array, n, G[i]);
		}

		//??\?????????
		System.out.println(cnt);
		for(int p=0;p<n;p++){
			System.out.print(array[p]);
			if(p!=n-1)System.out.println(" ");
		}System.out.println();

	}

	public static void main(String[] args){

		int n;
		int[] array;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		array=new int[n];

		for(int i=0;i<n;i++){
			array[i]=scan.nextInt();
			}


		shellSort(array, n);

		scan.close();
	}

}