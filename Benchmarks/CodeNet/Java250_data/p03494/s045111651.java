import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
      	int[] a = new int[n];
      	int count = 0;
				for (int i = 0; i < n; i++){
          a[i] = Integer.parseInt(sc.next());
        }
        while(true){
					boolean odd = false;
					for (int i = 0; i < n; i++){
						if(a[i]%2 != 0){
							odd = true;
						}
						}
						if(odd){
							break;
					}
					for(int i=0; i<n; i++){
						a[i] = a[i]/2;
					}
					count++;
				}
     System.out.print(count);
   }
}
