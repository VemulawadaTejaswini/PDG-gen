import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
    for(int i=0;i<=n;i++) {
    	for(int j=0;j<=m;j++) {
    		int buff=Math.max(0,(m-j)*i)+Math.max(0,(n-i)*j);
    		//System.out.println(buff);
    		if(buff==k) {
    			System.out.println("Yes");
    			System.exit(0);
    		}
    	}
    }
    System.out.println("No");
  }
}
