import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
		String str = String.valueOf(N);
      	for(int i=0; i<3;  i++){
			if(str.charAt(i)=='7'){
              	System.out.println("Yes");
              	return;
            }
        }
      
      	System.out.println("No");
        return;
	}
}
