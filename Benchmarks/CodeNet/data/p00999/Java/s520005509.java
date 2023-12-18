import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in), 1);

		while(true)  {
			try {
				String[] array=br.readLine().split(" ");
				int a=Integer.parseInt(array[0]);
				int b=Integer.parseInt(array[1]);
				int c=Integer.parseInt(array[2]);
				int d=Integer.parseInt(array[3]);
				int e=Integer.parseInt(array[4]);
				if(a==0 && b==0 && c==0 && d==0 && e==0)
					break;
				array=br.readLine().split(" ");
				int na=Integer.parseInt(array[0]);
				int nb=Integer.parseInt(array[1]);
				int nc=Integer.parseInt(array[2]);

				int sum=na*a+nb*b+nc*c;
//				System.out.println("\tnaive: "+sum);
				if(nc>=d) {
					int sumTemp=na*a+nb*b+nc*e;
					sum=sumTemp;
//					System.out.println("\tsumTemp1: "+sumTemp);
				} else {
					int sumTemp=Integer.MAX_VALUE;
					if(nb+nc>=d) {
						sumTemp=na*a+(nb+nc-d)*b+d*e;
//						System.out.println("\tsumTemp2: "+sumTemp);
					} else if(na+nb+nc>=d) {
						sumTemp=(na+nb+nc-d)*a+d*e;
//						System.out.println("\tsumTemp3: "+sumTemp);
					}
					if(sumTemp<sum) sum=sumTemp;
					if(nb+nc>=d-1 && (d-1-nc)*b+nc*c>d*e ) {
						sumTemp=na*a+(nb-(d-1-nc))*b+d*e;
//						System.out.println("\tsumTemp4: "+sumTemp);
					} else if(na+nb+nc>=d-1 && (d-1-nb-nc)*a+nb*b+nc*c>d*e) {
						sumTemp=(na-(d-1-nb-nc))*a+d*e;
//						System.out.println("\tsumTemp5: "+sumTemp);
					}
					if(sumTemp<sum) sum=sumTemp;
				}

				System.out.println(sum);
			} catch(IOException ex) {
				ex.printStackTrace();
				System.exit(-1);
			}
		}
	}
}