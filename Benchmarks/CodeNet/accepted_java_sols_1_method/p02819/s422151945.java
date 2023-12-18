	import java.util.*;
	 
	class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			boolean f = true;
			while(f) {
			if(a%2==0) {
				int c = a/2;
				if(a==2) {
					System.out.println(2);
					f = false;
				}else {
				for(int i = a+1;f;i++) {
					
					for(int j=c; j>=1;j--) {
					
						if(i%j==0 && j!=1) {
							break;
						}
						if(j==1) {
							System.out.println(i);
							f = false;
						}
					}
				i++;
				}
				}
			}else {
				int c=(a-1)/2;
				for(int i = a;f;i++) {
					
					for(int j=c; j>=1;j--) {
						
						if(i%j==0 && j!=1) {
							break;
						}
						if(j==1) {
							System.out.println(i);
							f = false;
						}
					}
					i++;
					}
				
				
				
				
			}
		}
			
	
	
			sc.close();
		}
	}