import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] arg){
	Scanner cin = new Scanner(System.in);
	int[] a = new int[10];
	int[] c = new int[10];
	for(int i=0; i<10; i++){
		a[i] = cin.nextInt();
		c[i] = a[i];
	}
	int count = 1;
	while(count == 1){
		count = 0;
		for(int k=0; k<9; k++){
			if(a[k] < a[k+1]){
				c[k] = a[k+1];
				c[k+1]=a[k];
				for(int i=0; i<10; i++){ a[i] = c[i];}
				count = 1;
			}
		}
	}
	for(int i=0; i<3; i++){System.out.println(a[i]);}
   }
}