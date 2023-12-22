import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
      	int b = scn.nextInt();
      	int ans = -1;
      	for(int i=1; i<=1000; i++){
          if((int)(i*0.08)==a && (int)(i*0.1)==b){
            ans = i;
            break;
          }
        }
		System.out.println(ans);
	}
}
