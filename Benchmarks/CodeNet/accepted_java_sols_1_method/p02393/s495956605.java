import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    int Array[] = new int[3];
    Scanner InData = new Scanner(System.in);
    Array[0] = InData.nextInt();
    Array[1] = InData.nextInt();
    Array[2] = InData.nextInt();
    int buffer;
    for(int n = 0; n<2;n++){
        for(int j = 0;j<2-n;j++){
            if(Array[j]>Array[j+1]){
            buffer = Array[j];
            Array[j]=Array[j+1];
            Array[j+1]=buffer;
            }
        }

    }
   System.out.println(Array[0]+" "+Array[1]+" "+Array[2]);
   
  
    }
}