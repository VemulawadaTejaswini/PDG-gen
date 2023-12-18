import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int num1 = sc.nextInt();
      	int num2 = sc.nextInt();
      	int lim = sc.nextInt();
      	int ans = 0, tmp1 = 0, tmp2 = 0;
      
      	for(int i = 0; i < num1 ; i++){
          	tmp1 += sc.nextInt();
          	if(tmp1 <= lim){
              ans++;
            }
      	}
      	for(int j = 0; j < num2 ; j++){
          	tmp2 += sc.nextInt();
          	if(tmp2 <= lim){
              ans++;
            }
        }
      System.out.println(ans);
    }
}