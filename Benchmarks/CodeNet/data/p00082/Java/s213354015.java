import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int[] h = new int[16];
			int[] p = new int[8];
			int[] a = new int[8];
			int[] b = new int[8];
			
			for(int i=0;i<16;i++){
				if(i%2==0){
					h[i] = 1;
				}else{
					if(i%8<4){
						h[i] = 4;
					}else{
						h[i] = 2;
					}
				}
			}
			
			for(int i=0;i<8;i++){
				p[i] = sc.nextInt();
			}
			
			int sub = 0;
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){
					sub = h[j+i] - p[j];
					if(sub<0)a[i]-=sub;
				}
			}
			
			b = Arrays.copyOf(a, 8);
			Arrays.sort(a);
			
			for(int i=0;i<8;i++){
				if(b[i]==a[0]){
					for(int j=0;j<8;j++){
						if(j!=0)System.out.print(" ");
						System.out.print(h[i+j]);
					}
					break;
				}
			}
			System.out.println();
			
		}
	}	
}