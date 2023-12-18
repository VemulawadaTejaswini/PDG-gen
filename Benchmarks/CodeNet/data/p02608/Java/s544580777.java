import java.util.*;
public class Main {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

HashSet<ArrayList<Integer>> s=new HashSet<>();
help:for(int i=1;i<=n;i++) {
	int count=0;
	for(int j=1;j<i;j++) {
		for(int k=1;k<i;k++) {
			for(int l=1;l<i;l++) {
				if((j*j+k*k+l*l+j*k+k*l+l*j)==i) {
			count++;
				}
				
			}
		}
	
	}
	System.out.println(count);
}
	}

}
