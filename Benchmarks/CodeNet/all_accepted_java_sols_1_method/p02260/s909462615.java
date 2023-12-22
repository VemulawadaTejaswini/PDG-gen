import java.awt.datatransfer.FlavorEvent;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;
  
public class Main{      
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.nextLine();
        String str2[] = str.split(" ");
        int ints[] = new int[n];
        int flag = 1;
        int count = 0;

        for(int i = 0;i<n;i++)
        {
            ints[i]= sc.nextInt();
        }

        for(int i = 0;i<n;i++)
        {
            int minj=i;
            for(int j=i;j<n;j++)
                {
                    if(ints[j]<ints[minj])
                        minj=j;
                }
                if(minj!=i){
                    int ii = ints[i];
                    ints[i]=ints[minj];
                    ints[minj]=ii;
                    count++;
                }
            
        }

        for (int i = 0; i<n;i++)
        {
          System.out.print(ints[i]);
          if(i!=n-1)
            System.out.print(" ");
        }
        System.out.print("\n"+count+"\n");
    }   
}
