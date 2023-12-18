import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		int i,j,wk;

		Scanner scan=new Scanner(System.in);
		int a[]=new int [3];
		
		for( i=0;i<3;i++){
			 a[i]=scan.nextInt();
		}
		
		scan.close();
		
		for( i=0;i<a.length-1;i++){
			wk=i;
			for( j=i+1;j<a.length;j++){
				if(a[wk]>a[j])
					wk=j;
			}
			if(wk!=i){
				int temp=0;
				temp=a[wk];
				a[wk]=a[i];
				a[i]=temp;
			}
		}
		
		for(i=0;i<a.length-1;i++){ 
			System.out.print(a[i]+" ");
		}
	 System.out.print(a[i]+"\n");
	}

}