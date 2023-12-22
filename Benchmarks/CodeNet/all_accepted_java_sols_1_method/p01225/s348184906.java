import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count;
        for(int i=0;i<n;i++){
            count=0;

            int[] data=new int[9];
            for(int j=0;j<9;j++)data[j]+=sc.nextInt();
            //十の位を定める(B,G,R)
            for(int j=0;j<9;j++){
                String str=sc.next();
                if(str.equals("B"))data[j]+=1*10;
                else if(str.equals("G"))data[j]+=2*10;
                else data[j]+=3*10;
            }
            Arrays.sort(data);
            if( ( data[0]==data[1] && data[1]==data[2] ) || ( data[1]==(data[0]+1) && data[2]==(data[1]+1) ) )count++;
            if( ( data[3]==data[4] && data[4]==data[5] ) || ( data[4]==(data[3]+1) && data[5]==(data[4]+1) ) )count++;
            if( ( data[6]==data[7] && data[7]==data[8] ) || ( data[7]==(data[6]+1) && data[8]==(data[7]+1) ) )count++;
            if( ( data[0]==data[1] && data[2]==data[3] && data[4]==data[5] ) || ( data[3]==data[4] && data[5]==data[6] && data[7]==data[8] ) )count+=2;
            if(count>=3)System.out.println(1);
            else System.out.println(0);
        }
        sc.close();
    }
}
