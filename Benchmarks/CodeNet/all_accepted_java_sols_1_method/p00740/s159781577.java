import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int exit=0;
		while(exit==0){
			int n = sc.nextInt();
			int p = sc.nextInt();
			if(n==0 && p==0){
				exit=1;
			}
			if(exit==0){
				int[] man = new int[n];
				int flag=0;
				int i=0;
				int cup=p;
				
				while(flag==0){
					if(cup!=0){
						man[i]++;
						cup--;
					}else if(cup==0){
						cup = man[i];
						man[i] = 0;
					}
					if(man[i]==p){
						flag=1;
						System.out.println(i);
					}
					i++;
					if(i==n)i=0;
				}
				
			}
		}
	}
}