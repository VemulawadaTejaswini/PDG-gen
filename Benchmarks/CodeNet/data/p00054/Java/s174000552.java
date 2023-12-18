import java.util.*;
public class Main {
    public static void main(String[] ano) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        	int a =scan.nextInt();
        	int b =scan.nextInt();
        	int n =scan.nextInt();
        	scan.nextLine();
        	int s=0;
        	for(int i=1;i<=n;i++){
        		s=s + (int)(a*(int)Math.pow(10, i)/b)%10;
        	}
        	System.out.println(s);
        }
}
}