import java.awt.print.Printable;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;
  
public class Main{      
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String strs[] = new String[100];
        int count2=0;
        while(true){
            String str = sc.next();
            //System.out.println("Str is "+str);
            if(str.equals("-"))
                {
                    for(int j=0;j<count2;j++){
                        System.out.println(strs[j]);
                    }
                    sc.close();
                    break;
                }
            int num = sc.nextInt();
            //System.out.println("Num is "+num);
            for(int i=0;i<num;i++)
            {
                int count=sc.nextInt();
                String str1=str.substring(0,count);
                String str2=str.substring(count,str.length());
                str = str2 + str1;
                //System.out.println("I is "+i+" str is "+str);
            }
            strs[count2]=str;
            count2++;
        }  
    }   
}
