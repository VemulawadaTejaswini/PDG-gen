import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int q1 = sc.nextInt();
			if(q1==0) break;
			
			int b = sc.nextInt();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int q2 = sc.nextInt();
			
			int ansA = -1;
			int ansB = -1;
			if(c1>c2 && (double)b/c2<q1);
			else{
				for(int i=q2;i>0;i--){
					if(b-c1*i>=0 && i+(b-c1*i)/c2>=q1){
						ansA = i;
						ansB = (b-c1*i)/c2;
						break;
					}
				}
			}
			
			if(ansA==-1) System.out.println("NA");
			else System.out.println(ansA + " " + ansB);
		}	
	}	
}