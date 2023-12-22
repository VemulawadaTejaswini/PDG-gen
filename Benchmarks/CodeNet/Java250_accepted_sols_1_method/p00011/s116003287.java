import java.awt.print.Printable;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;
  
public class Main{      
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int amidaArray[] = new int[n+1];

        for(int i=1;i<=n;i++){
            amidaArray[i] = i;
        }
        for(int i=0;i<w;i++){
            String str = sc.next();
            String[] strs = str.split(",");

            int a = Integer.parseInt(strs[0]);
            int b = Integer.parseInt(strs[1]);

            int temp = amidaArray[a];

            amidaArray[a]=amidaArray[b];

            amidaArray[b]=temp;
        }
        for(int i=1;i<=n;i++){
            System.out.println(amidaArray[i]);
        }
    }   
}
