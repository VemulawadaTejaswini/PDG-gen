import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		String line = br.readLine();

		String[] str = line.split(" ");
		int[] a = new int[size];
		for (int i=0; i<size; i++) {
			a[i] = Integer.parseInt(str[i]);
		}

		heapSort(a,size);

		StringBuilder sb = new StringBuilder();
		for (int i=size-1; i>=0; i--) {
			sb.append(" ").append(a[i]);
		}
		System.out.println(sb);
	}

	static void heapSort(int[] a,int n) {
        for (int i=(n-1)/2; i>=0; i--)
            downHeap(a,i,n-1);
        for (int i=n-1; i>0; i--) {
            swap(a,0,i);
            downHeap(a,0,i-1);
        }
    }

	static void downHeap(int[] a,int left,int right) {
        int temp = a[left];
        int child;
        int parent;

        for (parent=left; parent<(right+1)/2; parent=child) {
            int cl = parent*2+1;
            int cr = cl+1;
            child = (cr<=right && a[cr]>a[cl]) ? cr : cl;
            if(temp >= a[child])
                break;
            a[parent] = a[child];
        }
        a[parent] = temp;
    }

    static void swap(int[] a,int idx1,int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }
}