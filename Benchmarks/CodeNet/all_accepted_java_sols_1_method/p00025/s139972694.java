import java.util.*;
import java.math.*;
import java.text.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int[] a = new int[4];
			int[] b = new int[4];
			for(int i=0; i<4; i++){
				a[i] = in.nextInt();
			}
			for(int i=0; i<4; i++){
				b[i] = in.nextInt();
			}
			int hi = 0;
			int bl = 0;
			for(int i=0; i<4; i++){
				for(int j=0; j<4; j++){
					if(b[i] == a[j]){
						if(i==j) hi++;
						else bl++;
					}
				}
			}
			System.out.println(hi+" "+bl);
		}
	}
}