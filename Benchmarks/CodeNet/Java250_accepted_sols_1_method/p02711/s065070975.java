import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
      	int hundred=N/100;
        int ten=(N-hundred*100)/10;
        int one=(N-hundred*100-ten*10);
        
      	if(one==7 || ten==7 || hundred==7){
        System.out.println("Yes");}
      	else{
        System.out.println("No");}
	}
}