import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner kb=new Scanner(System.in);
		int[] a=new int[3];

		for(int i=0;i<3;i++){
			a[i]=kb.nextInt();
		}
		int b=a[0];
		if(a[0]<a[1]){
			b=a[0];
			a[0]=a[1];
			a[1]=b;
		}if(a[1]<a[2]){
			b=a[1];
			a[1]=a[2];
			a[2]=b;
		}if(a[2]<a[1]){
			b=a[2];
			a[2]=a[1];
			a[1]=b;
		}
		System.out.printf("%d %d %d\n",a[0],a[1],a[2]);
		kb.close();
	}

}