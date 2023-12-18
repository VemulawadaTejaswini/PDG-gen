import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long m=sc.nextLong();
		long x=sc.nextLong();
		int k=0,sum=0,count=0;
		ArrayList<Integer>list1=new ArrayList<>();
		ArrayList<Integer>list2=new ArrayList<>();
		for(long i=0;i<n;i++) {
			list1.add((int) sc.nextLong());
		}
		for(long i=0;i<m;i++) {
			list2.add((int) sc.nextLong());
		}
		for(long i=0;i<m;i++) {
			if(k==0) {
				if(sum<=x) {
					sum=sum+list1.get((int) i);
					count++;
					k=1;
				}
				else {
					break;
				}
			}
			else {
				if(sum<=x) {
					sum=sum+list2.get((int) i);
					count++;
					k=0;
				}
				else {
					break;
				}
			}
		}
		System.out.println(count);
		
	}
}