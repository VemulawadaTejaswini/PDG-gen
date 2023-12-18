
import java.util.*;
public class Main{
static int p=200003;
	public static void main(String[] args) {
							Scanner sc=new Scanner(System.in);
							int n=sc.nextInt();
							long a[]=new long[n];
							ArrayList<Long> aa=new ArrayList<>();
							for(int i=0;i<n;i++) {
								a[i]=sc.nextLong();
								if(a[i]!=0) {
									aa.add(a[i]);								
									}
							}
							long sum=0;
							for(int i=0;i<aa.size();i++) {
								for(int j=i+1;j<aa.size();j++) {
									sum+=(((aa.get(i)+p)%p)*((aa.get(j)+p)%p))%p;
									
								}
							}
							System.out.print(sum);
	}

}
