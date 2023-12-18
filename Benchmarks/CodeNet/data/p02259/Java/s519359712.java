import java.io.*;
import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] args){
        int N;
        int num[];
        String line;

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        try{
            line=reader.readLine();
            N=Integer.parseInt(line);

            if(N<1||100<N){
                return;
            }
            
            num=new int[N];
            Scanner scan=new Scanner(System.in);

            for(int i=0;i<N;i++){
                num[i]=Integer.parseInt(scan.next());
                if(num[i]<0||num[i]>100){
                    return;
                }
            }

            //バブルソート
            int swap_num=0;
            for(int i=0;i<N-1;i++){
                for(int j=N-1;j>i;j--){
                    if(num[j]<num[j-1]){
                        int temp=num[j];
                        num[j]=num[j-1];
                        num[j-1]=temp;

                        swap_num++;
                    }
                }
            }

            for(int i=0;i<N;i++){
                System.out.print(num[i]+" ");
            }
            System.out.println();
            System.out.println(swap_num);
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}
