import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int l = sc.nextInt();
        int sum = 0;
        int[] azi = new int[n];
        for(int i=0; i<n; i++){
            azi[i] = l+i;
          
        }
      
      if(l<0&&n+l>0||l==0){ 
        for(int i=0; i<n; i++){
            sum = sum + azi[i];
//          System.out.println(azi[i]);
        }
      }else if(l>0){
        for(int i=1; i<n; i++){
            sum = sum + azi[i];
//          System.out.println(azi[i]);
        }
      }else{
          for(int i=0; i<n-1; i++){
            sum = sum + azi[i];
//            System.out.println(azi[i]);
        }
      } 
        System.out.println(sum);
	}
}
