import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
        String [] a = new String[n];
        String [] a2 = new String[n];

        for(int i = 0; i < n; i++){
        	a[i] = stdIn.next();
        	a2[i] = a[i];
        }
        stdIn.close();

        for(int i=0; i < n;i++) {
			for(int j=n-1; j > i; j--){
				if(cardnumber(a[j]) < cardnumber(a[j-1])){
					String tmp= a[j];
					a[j]=a[j-1];
					a[j-1]=tmp;
				}
			}
		}

		for(int i=0; i < n-1;i++) {
			int minj = i;
			for(int j=i; j < n; j++){
				if(cardnumber(a2[minj]) > cardnumber(a2[j])){
					minj = j;
				}
			}
			if(minj != i) {
				String tmp= a2[i];
				a2[i]=a2[minj];
				a2[minj]=tmp;
			}
		}

        out_put(a);
        System.out.println("Stable");
        out_put(a2);
        if(Arrays.equals(a,a2)) {
            System.out.println("Stable");
        } else {
            System.out.println("Not stable");
        }
	}

	private static int cardnumber(String x){
		return Integer.valueOf(x.substring(1));
	}
	private static void out_put(String array[]){

        System.out.printf("%s", array[0]);

        if (array.length >1) {
        	for(int i = 1; i < array.length; i++){
        		System.out.printf(" %s", array[i]);
        	}
        }
        System.out.printf("%n");
    }
}

