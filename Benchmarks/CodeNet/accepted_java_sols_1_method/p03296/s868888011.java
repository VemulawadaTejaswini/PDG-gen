
import java.util.*;
class Main{
		public static void main(String[] args) {
			Scanner Cf=new Scanner(System.in);
			int N=Cf.nextInt();
			//no slimes should combine with
			//each other that means no 
			//same Ai's should group together
			int[] array=new int[N];
			for(int i=0;i<N;i++) {
				array[i]=Cf.nextInt();
			}
			int count = 0;
			if(array.length==2) {
				if(array[0]==array[1]) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
			}
			else {
			for(int j=0;j<N;) {
				
				if(	j+1<array.length &&
						j>0 && array[j-1]==array[j]
								&& array[j]==array[j+1] ) {
					count++;
					j=j+2;
				}
				else if(j>0 && j+1<array.length && array[j-1]==array[j] && array[j]!=array[j+1]
						) {
					count++;
					j=j+2;
				}
				else if(j==array.length-1 && array[j-1]==array[j]) {
					count++;
					break;
				}
				else {
					j++;
				}
			}
//			if(array[array.length-1]==array[array.length-2]) {
//				count++;
//			}
			
			System.out.println(count);
			}
			}
}
