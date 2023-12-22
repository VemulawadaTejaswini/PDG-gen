import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] c=new int[9];
    for(int i=0;i<9;i++)c[i]=sc.nextInt();
    for(int i=0;i<=Math.max(c[0], Math.max(c[1], c[2]));i++) {
    	int a1=i,b1=c[0]-a1,b2=c[1]-a1,b3=c[2]-a1,a2=c[3]-b1,a3=c[6]-b1;
    	if(a1+b1==c[0] && a1+b2==c[1]&& a1+b3==c[2]&& a2+b1==c[3]&& a2+b2==c[4]&& a2+b3==c[5]&& a3+b1==c[6]&& a3+b2==c[7]&& a3+b3==c[8]) {
    		System.out.println("Yes");
    		//System.out.println(a1+" "+a2+" "+a3+" "+b1+" "+b2+" "+b3);
    		System.exit(0);
    	}
    }
    System.out.println("No");
  }
}