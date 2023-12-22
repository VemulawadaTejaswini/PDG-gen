import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int i,n,reg1,reg2,sum1,sum2;
        for(;;){ 
        	n=sc.nextInt();
        	if(n==0){
        		break;
        	}else{
        		sum1=0;
        		sum2=0;
        		for(i=0;i<n;i++){
        			reg1=sc.nextInt();
        			reg2=sc.nextInt();
        			if(reg1>reg2){
        				sum1+=reg1+reg2;
        			}else if(reg1<reg2){
        				sum2+=reg1+reg2;
        			}else{
        				sum1+=reg1;
        				sum2+=reg2;
        			}
        		}
        		System.out.println(sum1+" "+sum2);
        	}
        }
    } 
}
