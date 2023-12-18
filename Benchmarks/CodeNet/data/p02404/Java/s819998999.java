import java.util.Scanner;
import javax.sound.midi.SysexMessage;
  
public class Main{      
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        for(;i<1000;i++){
            String str = sc.nextLine();
            if(str!=null){
            String[] str2 = str.split(" ");
            int x = Integer.parseInt(str2[0]);           
            int y = Integer.parseInt(str2[1]);

            if(x == 0 || y==0){
                System.out.print("\n\n");
                break;
            }
            else
            {
                for(int j=0;j<x;j++)
                {
                    if(j==0||j==x-1)
                    {
                        for(int k=0;k<y;k++)
                        {
                            System.out.print("#");
                        }
                    }
                    else
                    {
                        for(int k=0;k<y;k++)
                            {
                                if(k==0||k==y-1)
                                    System.out.print("#");
                                else
                                    System.out.print(".");
                            } 
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");
            }
            }
        }  
    }
}              

    
