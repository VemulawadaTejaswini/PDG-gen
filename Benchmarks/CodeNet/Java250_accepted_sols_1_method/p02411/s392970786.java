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
                int m = Integer.parseInt(str2[0]);           
                int f = Integer.parseInt(str2[1]);
                int r = Integer.parseInt(str2[2]);

                if(m == -1 && f == -1)
                {
                    break;
                }
                else if(m ==-1 || f == -1)
                {
                    System.out.println("F");
                }
                else if(m+f>=80)
                {
                    System.out.println("A");
                }
                else if(m+f>=65)
                {
                    System.out.println("B");
                }
                else if(m+f>=50)
                {
                    System.out.println("C");
                }
                else if(m+f>=30)
                {
                    if (r>=50) {
                        System.out.println("C");
                    }
                    else
                    {
                        System.out.println("D");
                    }
                }
                else
                {
                    System.out.println("F");
                }
            }
        }  
    }
}              

    
