import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int x,y,s,reg,max,l,reg2;
        for(;;){
        	reg=0;
        	max=0;
        	x=sc.nextInt();
        	if(x==0){
        		return;
        	}
        	y=sc.nextInt();
        	s=sc.nextInt();
        	for(int i=1;i<s;i++){
        		for(int j=1;j<s;j++){
        			reg2=i*(100+x)/100+j*(100+x)/100;
        			if(reg2==s){
        				reg=i*(100+y)/100+j*(100+y)/100;
        				if(reg>max){
        					max=reg;
        				}
        			}
        		}
        	}
        	System.out.println(max);
        }
    	
    }
}
