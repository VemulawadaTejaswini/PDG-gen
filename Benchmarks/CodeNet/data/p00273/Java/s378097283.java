import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int go,day,furo,puru,Fken,Pken,wari;
        Scanner sc=new Scanner(System.in);
        day=sc.nextInt();
        
        for(int a=0;a<day;a++){
            furo=sc.nextInt();
            puru=sc.nextInt();
            Fken=sc.nextInt();
            Pken=sc.nextInt();
            go=furo*Fken+puru*Pken;
            
            if(Fken>=5 && Pken>=2){
                go=go*8/10;
                
            }else{
                if(Fken<5){
                Fken=5;
                
            }if(Pken<2){
                Pken=2;
              
            }
              wari=(furo*Fken+puru*Pken)*8/10;  
       
               if(wari<go){
                go=wari;
               }
            }
           System.out.println(go);
        }
    }
}
            
            
                
            
                