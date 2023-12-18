import java.util.Scanner;

class Main{

	public static void main(String[] args){

		Scanner sc =new Scanner(System.in);

		int y1=0;
		int y2=0;
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
		
		String x1 =sc.next();
		String x2 =sc.next();
		
		if(x1.compareTo(x2)==0) {
			y1++;
			y2++;
		}
		
		if(x1.compareTo(x2)<0) 
			y2+=3;
		
		if(x1.compareTo(x2)>0) 
			y1+=3;
		
		}
		
	    System.out.println(y1+" "+y2);

}
}
