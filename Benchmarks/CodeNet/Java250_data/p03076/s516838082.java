import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int min = 10;
        int minMenu = 0;
        int result = 0;
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
            int mod = a[i] % 10;
            if(mod < min && mod != 0){
              min=mod;
              minMenu = i;
            }
        }
        for(int i=0;i<5;i++){
            if(i != minMenu){
              result += Math.ceil((float)a[i]/10)*10;
              
            }else{
              result += a[i];
            }
        }
        System.out.println(result);   
	}
}