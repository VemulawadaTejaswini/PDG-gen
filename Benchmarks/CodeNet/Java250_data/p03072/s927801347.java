import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        int[] a = new int[num];
  	 	for(int i=0; i<num; i++){
            a[i] = sc.nextInt();
        }
        int count = 0;
        for(int j=1; j<num; j++){
        	for(int i=0; i<j; i++){
             if(a[i] > a[j]) break;
             if(i+1 == j) count++;       
        	}
        }
		System.out.println(count+1);
	}
}