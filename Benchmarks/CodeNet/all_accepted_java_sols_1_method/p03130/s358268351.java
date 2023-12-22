import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  		int c[]={0,0,0,0};
      	int stack1;
      	int stack2;
      	boolean yn = true;
      
      	for(int i = 0;i < 3 && yn;i++){
          	stack1 = sc.nextInt() - 1;
          	stack2 = sc.nextInt() - 1;
        	c[stack1]++;
          	c[stack2]++;
          	if(c[stack1] > 2 || c[stack2] > 2) yn = false;
        }
      	
      	if(yn) System.out.println("YES");
      	else System.out.println("NO");
        
	}
}
