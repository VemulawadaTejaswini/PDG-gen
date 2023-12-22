import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//scan.useDelimiter("\n");
		int a[] = new int [200];
		int b[] = new int [200];
		int count[] = new int [200];
		int i = 0;
		while(scan.hasNextInt()){
			//scan.useDelimiter(" ");
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
			//scan.useDelimiter("\n");
			a[i] = a[i]+b[i];
			while(a[i]!=0){
				a[i]=a[i]/10;
				count[i]++;
			}
			i++;
		}
		int N = i;
		for(i=0;i<N;i++){
			System.out.println(count[i]);
		}
	}

}