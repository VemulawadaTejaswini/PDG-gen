import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      	int nam = 0;
        int min = 1001;
      	int max = -1;
      
      for(int i = 0;i < n;i++){
        nam = sc.nextInt();
        min = Math.min(min,nam);
        max = Math.max(max,nam);
      }
     	 System.out.print(max-min);   
    }
}