import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int ArrayA[] = new int[11000];
        int ArrayB[] = new int[11000];
        Scanner InData = new Scanner(System.in);
        for(int n = 1;n<11000; n++){
            ArrayA[n] = InData.nextInt();
            ArrayB[n] = InData.nextInt();
            if(ArrayA[n]==0 && ArrayB[n]==0)
                break;
        }

        int buffer;
        for(int n =1; n<11000; n++){
            if(ArrayA[n]==0 && ArrayB[n]==0)
                break;
            if(ArrayA[n]>ArrayB[n]){
                buffer = ArrayA[n];
                ArrayA[n] = ArrayB[n];
                ArrayB[n] = buffer;
            }
            
        }





        for(int n = 1; n<11000; n++){
            if(ArrayA[n]!=0 && ArrayB[n]!=0)
                System.out.println(ArrayA[n]+" "+ArrayB[n]);
            else break;

        }

    }


}