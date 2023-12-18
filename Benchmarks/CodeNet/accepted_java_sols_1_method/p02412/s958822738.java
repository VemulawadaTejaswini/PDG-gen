import java.util.*;



public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       
      int a,b,cnt=0;
      for(;;){
          
       a= sc.nextInt();
       b= sc.nextInt();
       if(a==0&&b==0){break;}
       
       for(int i=1;i<a;i++){
           for(int x=i+1;x<a;x++){
               for(int y=x+1;y<=a;y++){
                   if(i+x+y==b){
                       cnt++; }
                  
                   
               }
               
           }
       }System.out.println(cnt);
       cnt=0;
      }
    } 
     
}


