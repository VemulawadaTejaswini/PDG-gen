import java.util.*;
public class Main {
 
         
        public static void main(String[] args) throws java.io.IOException{
            Scanner scan = new Scanner(System.in);
            while(true){
            	
            	int s1 =scan.nextInt();
            	int s2 =scan.nextInt();
            	if((s1|s2)==0)break;
            	int c =0;
            	int max =s1+s2;
            	for(int i=1;i<5;i++){
            	s1 = scan.nextInt();
            	s2 = scan.nextInt();
            	if(Math.max(max, s1+s2)>max){
            		max = s1+s2;
            		c = i;
            	}
            	}
            	System.out.println((char)('A'+c)+" "+max);
            }
        }
}