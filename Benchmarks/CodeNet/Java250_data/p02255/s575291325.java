import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int array[] = new int [size];
		for(int i=0; i<size; i++ ){
			array[i] = sc.nextInt();
		}
		
		
		for(int k=0; k<size; k++){
			
			if(k == size-1){
				System.out.println(array[k]);
			}else{
				System.out.print(array[k] + " ");
			}
		}
		//?????\?????????
		for(int i=1; i<size; i++){
			int v = array[i];
			int j = i-1;
			while(j >= 0 && array[j] > v){
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = v;
		//???????????§
			for(int k=0; k<size; k++){
				if(k == size-1){
					System.out.println(array[k]);
				}else{
					System.out.print(array[k] + " ");
				}
			}
		}
	}
}