import java.awt.print.Printable;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;
import java.util.Arrays;
  
public class Main{      
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        String dict[]=new String[1000000];
        for(int i=0;i<count;i++){
            String str = sc.next();
            if(str.equals("insert"))
                dict[i]=sc.next();
            else{
                if(Arrays.asList(dict).contains(sc.next()))
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
            }
        }
        sc.close();
        
    }   
}
