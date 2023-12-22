import java.util.*;
public class Main {
	static final Scanner stdin = new Scanner(System.in);
	public static void main(String[] args) {
		while(stdin.hasNext()){
			
			int a = stdin.nextInt();
			int b = stdin.nextInt();
      
			int comp_val = a - b;
			int num, aval,m,n,ans1;
			
			if(comp_val > 0){
				for(int i = 0;i <= a;i++){
					aval = a - i;
					if(a%aval==0 && b%aval==0){
						m = a/aval;
						n = b/aval;
						ans1 = m * n * aval;
						System.out.println(aval+" "+ans1);
						
						break;
					}
				}
			}else{
				for(int i = 0;i <= b;i++){
					aval = b - i;
					if(a%aval==0 && b%aval==0){
						m = a/aval;
						n = b/aval;
						ans1 = m * n * aval;
						System.out.println(aval+" "+ans1);
						
						break;
					}
				}
			}
		}
	}

}