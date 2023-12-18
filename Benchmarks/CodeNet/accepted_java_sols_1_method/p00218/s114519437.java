import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
       
        while(true){
        	int n = scan.nextInt();
        	if(n==0)break;
        	while(n!=0){
        	boolean flag=true;
        	double [] p=new double [3];
        	int sum=0;
        	for(int i=0;i<3;i++){
        		p[i]=scan.nextInt();
        		if(p[i]==100){
        			System.out.println("A");
        			flag=false;
        			scan.nextLine();
        			break;
        		}
        		sum+=p[i];
        	}
        	double av =sum/3.0;
        	if(flag){
        		
        		if((p[0]+p[1])/2.0 >= 90){
        			System.out.println("A");
        		}
        		
        		else if(av >= 80){
        			System.out.println("A");
        		}
        		
        		else if(av >= 70){
        			System.out.println("B");
        		}
        		
        		else if(av >= 50 && (p[0]>=80 || p[1] >= 80)){
        			System.out.println("B");
        		}
        		else {
        			System.out.println("C");
        		}
        	}
        	n--;
        	}
        }
    }
}