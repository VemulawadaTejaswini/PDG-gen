import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		if(a>81){
          System.out.println("No");
        	return;
        }else{
          for(int i=1;i<10;i++){
            for(int j=1;j<10;j++){
              if(i*j==a){
                System.out.println("Yes");
              	return;
              }
            }
          }
        }
      	 System.out.println("No");
	}
}
