import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int[] p = new int[n];
      	int counter = 0;
      	for(int i = 0; i < n ; i ++){
        	p[i] = scan.nextInt();
        }
      	for(int j = 0; j < n-2; j++){
        	int[] v = new int[3];
          	v[0] = p[j];
          	v[1] = p[j + 1];
          	v[2] = p[j + 2];
          	Arrays.sort(v);
          	if(v[1] == p[j + 1]){
            	counter++;
            }
         }
      	System.out.print(counter);
    }

}