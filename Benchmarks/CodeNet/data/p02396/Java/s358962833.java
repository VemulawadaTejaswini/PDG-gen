import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int Array[] = new int[10002];
        Scanner InData = new Scanner(System.in);
        for(int n = 1;n<10002; n++){
            Array[n] = InData.nextInt();
            if(Array[n]=0)
                break;
        }
        for(int n = 1; n<10002; n++){
            if(Array[n]!=0)
                System.out.println("Case "+"n"+": "+Array[n]);
            else
                break;

        }

    }


}