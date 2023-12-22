import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer cnt = 0;
      	for(int i = 1; i < N+1; i++){
        	if(String.valueOf(i).length()%2==1){
            	cnt++;
            }
        }
		System.out.println(cnt);
	}
}
