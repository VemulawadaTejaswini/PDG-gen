import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int data[]=new int[100];
		int count=0;
		for(int i=0;i<n;i++) {
			data[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(i==0) {
				count++;
			}else {
				boolean flag=true;
				for(int j=0;j<i;j++) {
					if(data[i]<data[j]) {
						flag=false;
						break;
					}
				}
				if(flag) {
					count++;
				}
			}
		}
		
 
		System.out.println(count);
	}
}
