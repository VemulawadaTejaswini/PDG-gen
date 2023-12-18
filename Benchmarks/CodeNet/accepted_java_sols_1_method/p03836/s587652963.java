import java.util.*;
import java.math.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	/*static void sort(int[] A,int l,int r) {
		if(l=r) {
			
		}
		sort(A,0,(l+r)/2);
		sort(A,1+ (l+r)/2,r);
		
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//X+Y+Z=S   0<=X,Y,Z<=K

		int sx=sc.nextInt();
		int sy=sc.nextInt();
		int tx=sc.nextInt();
		int ty=sc.nextInt();
		
		for(int i=0;i<(ty-sy);i++) {
			System.out.print('U');
		}
		for(int i=0;i<(tx-sx);i++) {
			System.out.print('R');
		}	
		for(int i=0;i<(ty-sy);i++) {
			System.out.print('D');
		}
		for(int i=0;i<(tx-sx);i++) {
			System.out.print('L');
		}
		
		System.out.print('L');
		
		
		for(int i=0;i<(ty-sy)+1;i++) {
			System.out.print('U');
		}
		for(int i=0;i<(tx-sx)+1;i++) {
			System.out.print('R');
		}
		
		System.out.print('D');
		System.out.print('R');
		
		for(int i=0;i<(ty-sy)+1;i++) {
			System.out.print('D');
		}
		for(int i=0;i<(tx-sx)+1;i++) {
			System.out.print('L');
		}
		System.out.print('U');

	}

}