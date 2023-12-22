import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        
        int hukuzawa = 0;
        int higuchi = 0;
        int noguchi = 0;
      
        int i = 0;
        int j = 0;
        
        for(i = 0; i <= n ; i++){
          for(j = 0; j <= (n-i) ; j++){
            if(y == i*10000+j*5000+(n-i-j)*1000){
                    hukuzawa = i;
                    higuchi = j;
                    noguchi = n-i-j;
                    System.out.println(hukuzawa + " " + higuchi + " " + noguchi);
                    return;
              }else{
                 continue;
              }
          }
        }
      
      
       System.out.println(-1 + " " + -1 + " " + -1);
	}
}