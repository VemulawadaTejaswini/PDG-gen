import java.util.*;

class Main{

	public static void main(String[] args) {
		Scanner hoge = new Scanner(System.in);

		int[] a = new int [3];
	   
		a[0] = hoge.nextInt();
		a[1] = hoge.nextInt();
		a[2] = hoge.nextInt();

		int h;
		
		if(a[0]>a[1]&&a[0]>a[2]){
			h = a[0];
			a[0]=a[1];
			a[1]=a[2];
			a[2]=h;			   
		}else if(a[1]>a[0]&&a[1]>a[2]){
			h=a[1];
			a[1]=a[2];
			a[2]=h;
		}
		//a[2] became the maximum

		if(a[0]>a[1]){
			h = a[0];
			a[0]=a[1];
			a[1]=h;		  
		}

		System.out.println(a[0]+" "+a[1]+" "+a[2]);

	}



}