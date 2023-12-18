import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line1=sc.nextLine().split(" ");
        int l=Integer.parseInt(line1[0]);
        int r=Integer.parseInt(line1[1]);
        int d=Integer.parseInt(line1[2]);
		
		int count=0;
		for(int a=l;a<=r;a++) {
			if(a%d==0) {
				count++;
			}
		}
        
        System.out.println(count);
        
        
	}
  
}
