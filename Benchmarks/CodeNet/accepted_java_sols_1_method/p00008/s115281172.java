import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,i,j,k;
        while (sc.hasNextInt()){
        	 int n=sc.nextInt();
        	 b=0;
        	for(i=0;i<10;i++){
        		for(j=0;j<10;j++){
        			for(k=0;k<10;k++){	
        				for(a=0;a<10;a++){
        					if(i+j+k+a==n)
        						b++;
        					else if(i+j+k+a>n)break;
        					
        					
        				}
        			}
        		}
        	}System.out.println(b);
        }
    }
}