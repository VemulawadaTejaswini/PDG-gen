import java.util.*;
public class Main { 
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String o="";
       int a=sc.nextInt(); 
       if(a<=3){
         o=Integer.toString(a);
       }else{
      	while(a<=100003){
         int n=(int)Math.sqrt((double)a); 
         boolean end=false;
         for (int i=2;i<=n;i++){
              if(a%i==0){
                  break;
              }else if(i==n){
                  o=Integer.toString(a);
                	end=true;
                  break;
              }
            }
          if (end)break;
      	  a++;
    	}
       }
      System.out.println(o);
    }
}