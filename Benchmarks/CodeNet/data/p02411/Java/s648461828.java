import java.io.*;
import java.util.Arrays;
class Main{
    public static void main(String[] args) throws IOException {
        int i;
        int[] n = new int[990];
        String[] str = new String[990];
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(;;){
            str = in.readLine().split(" ");
            for(i=0;i<3;i++){
                n[i]=Integer.parseInt(str[i]);
            }
            if(n[0]==n[1] && n[0]==-1)   break;
            if((n[0]==-1) || (n[1]==-1)) 
                System.out.println("F");
            else if(n[0]+n[1]<30)        
                System.out.println("F");
            else if((30<=n[0]+n[1] && n[0]+n[1]<50) && n[2]<50)  
                System.out.println("D");
            else if((30<=n[0]+n[1] && n[0]+n[1]<50) && n[2]>=50) 
                System.out.println("C");
            else if((50<=n[0]+n[1] && n[0]+n[1]<65))     
                System.out.println("C");
            else if((65<=n[0]+n[1]) && (n[0]+n[1]<80))   
                System.out.println("B");
            else if(80<=n[0]+n[1])   
                System.out.println("A");  
        }          
        System.out.flush();
    }
}