import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int count = 1;
		int s = 7;
		
		if(k % 2 == 0 || k % 5 == 0){
			System.out.println("-1");
		}else if(k == 1 || k == 7){
        	System.out.println("1");
        }else{
			while(count <= k){
				if(s % k == 0){
					System.out.println(count);
					break;
				}
				count++;
				s = ((s * 10) + 7) % k;
				
			}
		}
	}
}