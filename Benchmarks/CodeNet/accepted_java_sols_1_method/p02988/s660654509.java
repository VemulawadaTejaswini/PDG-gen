import java.util.*;
public class Main {

    public static void main(String[] args) {
     
        Scanner entrada=new Scanner(System.in);
        int k=entrada.nextInt();
        int x[]=new int[k];
        int x2[]=new int[3];
        int count=0;
        int count2=0;
        for (int i = 0; i < k; i++) {
            x[i]=entrada.nextInt();
        }
      
        for (int i = 0; i < k-2; i++) {
            for (int j = 0; j < 3; j++) {
            
           x2[j]=x[j+count];
          
        }
        count++;  
     Arrays.sort(x2);
         
       if(x[count]==x2[1]){
           count2++;
       
       }
       
       }
  System.out.println(count2);
    }
    
}
