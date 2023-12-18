import java.util.*;
 
public class test{
	public void main(String[] args){
		Scanner sc = new Scanner();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        int n = 0;
        
        for(int i = num1;i <= num2;i++){
        	if(i % num3 == 0){
            	n++;
            }
        }
        System.out.println(n);
	}
}