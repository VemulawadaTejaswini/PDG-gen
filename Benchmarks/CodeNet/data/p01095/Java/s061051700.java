import java.util.*;
public class main{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String n = sc.nextLine();
            String[] nu = n.split(" ");

            int ju = Integer.parseInt(nu[0]);
            int ku = Integer.parseInt(nu[1]);
            int[] take = new int[ku];
            int year=0,i,j=0,count=1,judge=0,max=0;

            if(ju == 0 && ku == 0) break;
            
            
            take[0] = ju;
            year = ju+1;

            while(true){
                
                if(count == ku+1) break;

                for(i=0;i<count;i++){
                  if(year % take[i] == 0) {
                    judge = 1;
                    break;
                  }
                }
                
                if(judge == 0){
                    if(count == ku) break;
                    count++;
                    take[count-1] = year;
                }

                year++;
                judge = 0;

            }

            System.out.println(year);
            
            
            
        }
    }
}
