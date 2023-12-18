import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
      	int card = sc.nextInt();
      	int nam = sc.nextInt();
      	int max = -1;int min = 999999;
      
      for(int i = 0; i < nam ;i++){
      	 max = Math.max(max,sc.nextInt());
         min = Math.min(min,sc.nextInt());
      }
      	int cnt = 0;
      	for(int i = max;i <=min;i++){
        cnt++;
        }

		System.out.print(cnt);
      	


    }
}