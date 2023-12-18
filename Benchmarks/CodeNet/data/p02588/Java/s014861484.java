import java.util.*;

class Text6{
   public static void main(String args[]){
     try{
     Scanner in=new Scanner(System.in);
     int t=in.nextInt();
    int i;   
        double a[]=new double[100000]; 
for(i=0;i<t;i++)
  a[i]=in.nextDouble();
       int j;
       int count=0;
       for(i=0;i<t;i++){
         for(j=0;j<t;j++){
           if(i!=j){
             double m=a[i]*a[j];
             if(m==Math.round(m)){
//System.out.println(a[i]+" * "+a[j]+" == "+m);
               count++;

}
           }
         }
       }
         System.out.println(count/2+"");
       
       
     }catch(Exception e){
     System.out.print("");
     }
   }
  
}