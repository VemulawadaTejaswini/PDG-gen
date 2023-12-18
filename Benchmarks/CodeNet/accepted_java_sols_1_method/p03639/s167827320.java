import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),count4=0,count2=0;
    long[] a=new long[n];
    for(int i=0;i<n;i++) {
    	a[i]=sc.nextLong();
    	if(a[i]%4==0)count4++;
    	else if(a[i]%2==0)count2++;
    }
    if(count4+count2/2>=n/2) {
    	System.out.println("Yes");
    }else {
    	System.out.println("No");
    }
  }
}
