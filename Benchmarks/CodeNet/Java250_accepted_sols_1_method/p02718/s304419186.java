import java.util.*;
        public class Main {
        	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[]=new int[n];
		int x=0;
		int aa=0;
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
			aa+=a[i];
		}
		for(int i=0;i<n;i++){
			if(((double)aa/(4*m))<=a[i]){
				x++;
			}
		}
		if(m<=x){
			System.out.print("Yes");
		}else{
			System.out.print("No");
		}
	}
        }