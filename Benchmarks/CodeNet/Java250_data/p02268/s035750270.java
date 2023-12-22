import java.util.*;

public class Main{
	static int search(int[] l,int key){
		int left = 0 ;
		int right = l.length;
		int mid ;
		
		while(left < right){
			mid = (left + right) / 2 ;
			if(l[mid] == key){
				return mid;
			}
			else if(l[mid] < key){
				left = mid +1 ;
			}
			else if(key < l[mid]){
				right = mid;
			}
		}
		return -1 ;
	}

	public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);

	    int n = scanner.nextInt();
	    int[] l = new int[n];
	    for(int i = 0; i < n; i++){
				l[i]=scanner.nextInt();
			}

	    int q = scanner.nextInt();
	    int sum = 0;

	    for(int i = 0; i < q; i++){
	        if(search(l, scanner.nextInt() ) >= 0){
						sum++;
					}
	    }

	    System.out.println(sum);
	}
}

