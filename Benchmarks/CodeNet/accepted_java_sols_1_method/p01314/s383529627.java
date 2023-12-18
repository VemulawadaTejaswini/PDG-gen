import java.util.Scanner;

   class Main{
         static public void main(String[] args){
               Scanner scan = new Scanner(System.in);

               int a;
               a =Integer.parseInt(scan.next());
               while(a!=0){
                  int c1=0;
                  
                  for(int j=1;j<1000;j++){
                     for(int k=1;k<1000;k++){
                     
                        int l=(j+1)*(2*k+j)/2;
                        if(l == a){
                           c1++;
                     
                         
                        }
                     
                        
                         
                       
                   
                  
                        }
                   }
                   System.out.println(c1);
                   
                   a =Integer.parseInt(scan.next());
               }
         }
   
   
   
   }