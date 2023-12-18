import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H,i;
		H = sc.nextInt();
		int[] heap = new int[H+1];
		for(i=1;i<heap.length;i++){
			heap[i] =sc.nextInt();
		}
		
		for(i=1;i<heap.length;i++){
			System.out.print("node "+i+": key = "+heap[i]+",");
			if((i/2)>0) System.out.print(" parent key = "+heap[i/2]+",");
			if((2*i)<=heap.length-1) System.out.print(" left key = "+heap[2*i]+",");
			if(((2*i)+1)<=heap.length-1) System.out.print(" right key = "+heap[(2*i)+1]+",");
			System.out.println("");
		}
 	}

}

