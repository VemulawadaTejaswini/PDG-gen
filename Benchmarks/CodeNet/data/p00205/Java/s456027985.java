import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int[] a = new int[5];
			int[] b = new int[4];
			
			a[0] = sc.nextInt();
			if(a[0]==0)break;
			b[a[0]]++;
			for(int i=1;i<5;i++){
				a[i] = sc.nextInt();
				b[a[i]]++;
			}
			
			if((b[1]>0 && b[2]>0 && b[3]>0) || b[1]==5 || b[2]==5 || b[3]==5){
				for(int i=0;i<5;i++){
					System.out.println("3");
				}
			}else{
				for(int i=0;i<5;i++){
					if(b[1]==0){
						if(a[i]==2) System.out.println("1");
						else System.out.println("2");
					}
					if(b[2]==0){
						if(a[i]==3) System.out.println("1");
						else System.out.println("2");
					}
					if(b[3]==0){
						if(a[i]==1) System.out.println("1");
						else System.out.println("2");
					}
				}
			}
	
		}
	}	
}