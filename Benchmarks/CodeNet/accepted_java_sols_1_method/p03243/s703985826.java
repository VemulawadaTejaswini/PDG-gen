import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {111,222,333,444,555,666,777,888,999};
		int n = sc.nextInt();
		for(int i=0 ; i<9 ; i++){
		    if(n<=arr[i]){
		        System.out.println(arr[i]);
		        break;
		    }
		}
	}
}