
import java.io.*;
import java.util.*;


public class Main{ 

	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		Heap heap = new Heap(scan.nextInt());
		scan.nextLine();
		heap.Load(scan.nextLine());
		heap.show();
	}
}

class Heap{
	int HeapSize;
	int[] list;
	public Heap(int hs){
		HeapSize = hs;
		list = new int[hs+1];
	}

	public void Load(String line){
		String[] tmp = line.split(" ");
		for(int i=0; i<HeapSize;i++)
			list[i+1]=Integer.parseInt(tmp[i]);
	}
	public void show(){
		for(int i=1; i<HeapSize+1;i++){
			int l=i*2;
			int r=i*2+1;
			System.out.printf("node %d: key = %d, ",i,list[i]);
			if(i!=1){
				int p = (i%2==0) ? i/2 : (i-1)/2;
				System.out.printf("parent key = %d, ",list[p]);
			}
			if(l<=HeapSize)
				System.out.printf("left key = %d, ",list[l]);
			if(r<=HeapSize)
				System.out.printf("right key = %d, ",list[r]);			
			System.out.printf("\n");
		}
		
	}
	
}