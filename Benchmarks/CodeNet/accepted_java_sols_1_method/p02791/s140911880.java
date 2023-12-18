import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] p = new int[n];
      
      	for(int i = 0; i < p.length; i++){
        	p[i] = sc.nextInt();
		}
      	int min = p[0];
        int count = 1;
        for(int i = 0; i < p.length; i++){
        	if(min > p[i]){
            	min = p[i];
                count += 1;
            }
        }
        System.out.println(count);
     }
}