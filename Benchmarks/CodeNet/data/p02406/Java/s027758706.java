import java.util.Scanner;
class Main {
    
    public static void main(String[] args){
    StringBuilder cout = new StringBuilder();
     Scanner s = new Scanner(System.in);
   int  n=s.nextInt();
    
   for(int i=0;i<n;i++){
       int x=i;
       if(x%3==0){
           cout.append(" "+i);
           continue;
       }do{
           if(x%10==3){
               cout.append(" "+1);
               break;}
               x/=10;
           }while(x!=0);
       }
       System.out.println(cout);
       
}
}
 
   

