import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        int count;
        int[] array = new int[100];
        int key;
        int counter = 0;

        try{
            Scanner scan = new Scanner(System.in);
            String str = scan.next();

            count = Integer.parseInt(str);

            for(int i = 0; i < count; i++){
                str = scan.next();
                array[i] = Integer.parseInt(str);
            }

            //Sort Part
            for(int i = 0; i < count - 1; i++){
                for(int j = count - 1; j > i; j--){
                    //System.out.println("---OK");
                    if(array[j] < array[j-1]){
                        key = array[j-1];
                        array[j-1] = array[j];
                        array[j] = key;
                        counter++;
                    }
                }
                //System.out.println("OK");
            }

            for(int i = 0; i < count; i++){
                if(i == count - 1){
                    System.out.println(array[i]);
                }else{
                    System.out.print(array[i] + " ");
                }
            }

            System.out.println(counter);

        }catch(Exception e){
            System.out.println("ERROR");
        }

    }
}

