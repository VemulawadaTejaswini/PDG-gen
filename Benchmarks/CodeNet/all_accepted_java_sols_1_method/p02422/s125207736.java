import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String com;
         int a,b;
         String p;
    
        String str = sc.nextLine();
        int q=sc.nextInt();
        
        for(int i=1;i<=q;i++){
        	 com = sc.next();
           if(com.equals("print")){
              a = sc.nextInt();
              b = sc.nextInt();
              System.out.println(str.substring(a,b+1));
             }
            else if(com.equals("reverse")){
                a = sc.nextInt();
                b = sc.nextInt();
                String temp1=str.substring(0,a);
                String temp2=str.substring(a,b+1);
                String temp3=str.substring(b+1);
                StringBuffer sb=new StringBuffer(temp2);
                temp2 = sb.reverse().toString();
        	    str=temp1+temp2+temp3;
           }
           else if(com.equals("replace")){
                a = sc.nextInt();
                b = sc.nextInt();
                p = sc.next();
               String temp1=str.substring(0,a);
               String temp3=str.substring(b+1);
               str=temp1+p+temp3;
           }
         }
       sc.close();
  } 
}
