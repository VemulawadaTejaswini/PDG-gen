import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int p=sc.nextInt();
        
        for(int i=0;i<p;i++){
            String order=sc.next();
            int a=sc.nextInt();
            int b=sc.nextInt();
            
            if(order.equals("replace")){
                String rep=sc.next();
                str=str.substring(0,a)+rep+str.substring(b+1,str.length());
                
            }else if(order.equals("reverse")){
                StringBuffer sb=new StringBuffer(str.substring(a,b+1));
                String rvs=sb.reverse().toString();
                str=str.substring(0,a)+rvs+str.substring(b+1,str.length());
                
            }else{
                System.out.println(str.substring(a,b+1));
            }
        }
    }
}
