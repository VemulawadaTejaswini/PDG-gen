import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		String ans = "";
		while(n>0) {
			if(n%26==1) {
				ans = 'a'+ans;
				n=n/26;
				
			}
			else if(n%26==2) {
				ans='b'+ans;
				n=n/26;
				
			}
			else if(n%26==3) {
				ans='c'+ans;
				n=n/26;
				
			}
			else if(n%26==4) {
				ans='d'+ans;
				n=n/26;
				
			}
			else if(n%26==5) {
				ans='e'+ans;
				n=n/26;
				
			}
			else if(n%26==6) {
				ans='f'+ans;
				n=n/26;
				
			}
			else if(n%26==7) {
				ans='g'+ans;
				n=n/26;
				
			}
			else if(n%26==8) {
				ans='h'+ans;
				n=n/26;
				
			}
			else if(n%26==9) {
				ans='i'+ans;
				n=n/26;
				
			}
			else if(n%26==10) {
				ans='j'+ans;
				n=n/26;
				
			}
			else if(n%26==11) {
				ans='k'+ans;
				n=n/26;
				
			}
			else if(n%26==12) {
				ans='l'+ans;
				n=n/26;
				
			}
			else if(n%26==13) {
				ans='m'+ans;
				n=n/26;
				
			}
			else if(n%26==14) {
				ans='n'+ans;
				n=n/26;
				
			}
			else if(n%26==15) {
				ans='o'+ans;
				n=n/26;
				
			}
			else if(n%26==16) {
				ans='p'+ans;
				n=n/26;
				
			}
			else if(n%26==17) {
				ans='q'+ans;
				n=n/26;
				
			}
			else if(n%26==18) {
				ans='r'+ans;
				n=n/26;
				
			}
			else if(n%26==19) {
				ans='s'+ans;
				n=n/26;
				
			}
			else if(n%26==20) {
				ans='t'+ans;
				n=n/26;
				
			}
			else if(n%26==21) {
				ans='u'+ans;
				n=n/26;
				
			}
			else if(n%26==22) {
				ans='v'+ans;
				n=n/26;
				
			}
			else if(n%26==23) {
				ans='w'+ans;
				n=n/26;
				
			}
			else if(n%26==24) {
				ans='x'+ans;
				n=n/26;
				
			}
			else if(n%26==25) {
				ans='y'+ans;
				n=n/26;
				
			}
			else if(n%26==0) {
				ans='z'+ans;
				n=n/26-1;
				
			}
		}
		System.out.println(ans);
	 }
}