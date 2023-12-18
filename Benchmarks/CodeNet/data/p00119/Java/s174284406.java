import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[] a = new int[m];
			int[] b = new int[m];
			int[] c = new int[n];
			
			for(int i=0;i<n;i++) c[i] = i+1;
			for(int i=0;i<m;i++){
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
			
			boolean flag, check;
			int temp;
			int rec = 0;
			while(true){
				flag = false;
				for(int i=0;i<m;i++){
					check = false;
					for(int j=0;j<n;j++){
						if(c[j]==b[i]){
							check = true;
							rec = j;
						}else if(c[j]==a[i]){
							if(check==true){
								temp = c[rec];
								c[rec] = c[j];
								c[j] = temp;
								flag = true;
							}
							break;
						}
					}
				}
				if(flag==false) break;
			}
			
			for(int i=0;i<n;i++) System.out.println(c[i]);
		}	
	}	
}