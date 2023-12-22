import java.util.*;
public class Main {

    
    public static void main(String[] args) {
     
        Scanner entrada=new Scanner(System.in);
       int x[]=new int[2];
       int x2[]=new int[3];
       
        for (int i = 0; i < 2; i++) {
            x[i]=entrada.nextInt();
     }
      
       x2[0]=x[0]+x[0]-1;
       x2[1]=x[0]+x[1];
       x2[2]=x[1]+x[1]-1;
       
      Arrays.sort(x2);
        System.out.println(x2[2]);
    }
    
}
