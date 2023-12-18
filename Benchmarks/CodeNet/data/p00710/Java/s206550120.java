import java.awt.print.Printable;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;
  
public class Main{      
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            int r = sc.nextInt();
        
            if(n==0&&r==0)
                break;

            int fudas[] =new int[n+1];
            int count=1;
            for(int i=n;i>0;i--)
            {
                fudas[i]=count;
                //System.out.println("fudas["+i+"] = "+count);
                count++;
            }
            //System.out.println("----");
            for(int i=0;i<r;i++)
            {
                int p = sc.nextInt();
                int c = sc.nextInt();
                int fudas_p[] = new int[p];
                for(int j=1;j<p;j++)
                {
                    fudas_p[j]=fudas[j];
                }
                for(int j=1;j<p;j++){
                    //System.out.println("fudas_p["+j+"] = "+fudas_p[j]);
                }
                //System.out.println("----");
                for(int j=1;j<=c;j++)
                {
                    fudas[j]=fudas[j+p-1];
                }
                for(int j=1;j<=c;j++){
                    //System.out.println("fudas["+j+"] = "+fudas[j]);
                }
                //System.out.println("----");
                for(int j=1;j<p;j++)
                {
                    fudas[j+c]=fudas_p[j];
                }
                for(int j=1;j<=n;j++){
                    //System.out.println("fudas["+j+"] = "+fudas[j]);
                }
                //System.out.println("----");
            }
            System.out.println(fudas[1]);
        }
        sc.close();
        
    }   
}
