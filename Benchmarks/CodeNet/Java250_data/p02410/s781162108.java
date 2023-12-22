import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new TEST().doIt();
    }
    class TEST{
        void doIt(){
        	int n = sc.nextInt();
        	int m = sc.nextInt();
        	int a[][] = new int [n][m];
        	int b[] = new int [m];
        	for(int i = 0;i < n;i++){
        		for(int j = 0;j < m;j++){
        			a[i][j] = sc.nextInt();
        		}
        	}
        	for(int i = 0;i < m;i++){
        		b[i] = sc.nextInt();
        	}
        	for(int i = 0;i < n;i++){
        		int sum = 0;
        		for(int j = 0;j < m;j++){
        			sum = sum + a[i][j] * b[j];
        		}
        		System.out.println(sum);
        	}
        }
    }
}