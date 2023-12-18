import java.util.*;
public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
      	 	int a = 0;
      		int b = 0;
			for(int i=0; i<n;i++){
              a++;
              int lengthA = String.valueOf(a).length();
              if(lengthA%2!=0){
                b++;
              }
            }
			System.out.println(b);    
	}
}