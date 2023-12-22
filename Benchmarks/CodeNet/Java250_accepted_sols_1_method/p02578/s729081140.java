import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
		int n = sc.nextInt();
        long soukei = 0;
      	int amae = 0;

      	for(int i = 0 ; i < n ; i++){
        	int a = sc.nextInt();
        	if(a < amae){
            	soukei = soukei + (amae-a);
            }else{
            	amae = a;
            }
        	
        }

		System.out.println(soukei);

		
	}
}