import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int p = sc.nextInt();
			if(n==0 && p==0)break;
			
			int[] man = new int[n];
			int i=0;
			int cup=p;
			
			while(true){
				if(cup!=0){
					man[i]++;
					cup--;
				}else if(cup==0){
					cup = man[i];
					man[i] = 0;
				}
				if(man[i]==p){
					System.out.println(i);
					break;
				}
				i++;
				if(i==n)i=0;
			}
		}
	}
}