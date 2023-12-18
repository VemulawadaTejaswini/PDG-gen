import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        int count;
        int[] array = new int[255];
        int key;

        try{
            Scanner scan = new Scanner(System.in);
            String str = scan.next();

            count = Integer.parseInt(str);

            for(int i = 0; i < count; i++){
                str = scan.next();
                array[i] = Integer.parseInt(str);
                System.out.print(array[i] + " ");
            }

            System.out.println();

            //Insertion Sort Part
            for(int i = 1; i < count; i++){
                key = array[i];
                int j = i -1;
                while(j >= 0 && array[j] > key){
                    array[j+1] = array[j];
                    j--;
                }
                array[j+1] = key;

                //if(key != array[i]){
                for(int k = 0; k < count; k++){
                    if(k == count - 1){
                        System.out.println(array[k]);
                    }
                    System.out.print(array[k] + " ");
                }
                //}

            }

        }catch(Exception e){
            System.out.println("ERROR");
        }

    }
}

