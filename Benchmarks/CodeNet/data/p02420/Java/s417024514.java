import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
        	String s=sc.next();
            if(s.equals("-"))
                break;
        	int m=sc.nextInt();
        	for(int i=0;i<m;i++){
           		int h=sc.nextInt();
           		s=s.concat(s.substring(0,h));
                StringBuffer sb=new StringBuffer(s);
            	sb=sb.delete(0,h);
                s=sb.toString();
        	}
        	System.out.println(s);
        }
        
    }
}
