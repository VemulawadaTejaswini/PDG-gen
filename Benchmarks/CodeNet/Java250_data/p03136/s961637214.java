import java.util.Scanner;

class Main {
  public static void main(String args[]) {
        Scanner scanner1 = new Scanner(System.in);
        //System.out.println("数値を入力してください。");
        //Scanner scanner2 = new Scanner(System.in);
        //System.out.println("数値を入力してください。");
        int n = scanner1.nextInt();
        int m[] = new int[n];
        int sum = 0;
        for(int i = 0;i < n;i++){
        	m[i] = scanner1.nextInt();
        	sum = sum + m[i];
        }
        
        int p = 0;
        
        for(int i = 0;i < n;i++){
        	if(sum - m[i] <= m[i]){
        		System.out.println("No");
        		p++;
        		break;
        	}
        }
        if(p == 0){
        	System.out.println("Yes");
        }	
   }
}