import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int longs[] = new int[n];
		int cnt=0;
		int flag=0;
		
		for(int i=0 ; i<n ; i++) {
			longs[i] = sc.nextInt();
		}
		//For debug
		//for(int i : longs) {
		//	System.out.print(i+" ");
		//}
		sort_small(longs);
		//System.out.println();
		//for(int i : longs) {
		//	System.out.print(i+" ");
		//}
		//System.out.println();
		for(int i=0 ; i<longs.length ; i++) {
			if(flag < longs[i]) {
				cnt++;
				flag = longs[i];
			}
		}
		System.out.println(cnt);
	}
	
	static void sort_big(int[] data) {// �~���ɕ��ёւ���֐�
		int work;
		for(int i=0 ; i<data.length-1 ; i++) {
			for(int k=i+1 ; k<data.length ; k++) {
				if(data[i] < data[k]) {
					work = data[i];
					data[i] = data[k];
					data[k] = work;
				}
			}
		}
	}
	static void sort_small(int[] data) {// �����ɕ��ёւ���֐�
		int work;
		for(int i=0 ; i<data.length-1 ; i++) {
			for(int k=i+1 ; k<data.length ; k++) {
				if(data[i] > data[k]) {
					work = data[i];
					data[i] = data[k];
					data[k] = work;
				}
			}
		}
	}
}
