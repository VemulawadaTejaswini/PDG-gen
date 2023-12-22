import java.util.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        long k=sc.nextLong();
        int l=s.length();
        int x=0;
      	long o=0;
        char a=s.charAt(0);
      	char b;
        boolean p=false;
        for(int i=0;i<l-1;i++){
        	if(s.charAt(i)==s.charAt(i+1)){
                if(i==l-2){
                	o=k*l/2;
                    System.out.println(o);
                    return;
                }
            	continue;
            }else{
            	break;
            }
          
        }
        if(l>1){
            b=s.charAt(1);
            for(int i=1;i<l;i++){
                b=s.charAt(i);
                if(a==b && !p){
                    p=true;
                    x++;
                }else{
                    p=false;
                }
                a=b;
            }
            o+=x*k;
            if(!p && b==s.charAt(0)){
                o+=k-1;
            }
          
            int x2=0;
      		long o2=0;
        	char a2=s.charAt(l-1);
      		char b2=s.charAt(l-2);
            boolean p2=false;
            for(int i=l-2;i>=0;i--){
                b2=s.charAt(i);
                if(a2==b2 && !p2){
                    p2=true;
                    x2++;
                }else{
                    p2=false;
                }
                a2=b2;
            }
            o2+=x2*k;
            if(!p2 && b2==s.charAt(l-1)){
                o2+=k-1;
            }
            o=Math.min(o,o2);
        }else{
        	o=k/2;
        }
        System.out.println(o);
    }
}