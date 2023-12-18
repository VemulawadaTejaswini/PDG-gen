import java.util.*;

class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int c,d = 0;
		int[] array = new int[a];
		
		for(int i=0;i<a;i++){
			array[i] = sc.nextInt();
		}
		output(array);
		
		for(int b=1;b<array.length;b++){
			c = array[b];
			d = b-1;
			while(d>=0 && array[d] > c){
				array[d+1] = array[d];
				d--;
			}
			array[d+1] = c;
			output(array);
		}
	}
		
		static void output(int[] a){
			for (int i=0; i<a.length; i++) {
				System.out.print(a[i]);
				if(i<a.length-1){
					System.out.print(" ");
				}else{
					System.out.println();
				}
			}
		}
}
