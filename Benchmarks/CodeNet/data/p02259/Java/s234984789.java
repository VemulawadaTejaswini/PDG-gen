import java.io.*;

public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String num = reader.readLine();
            int n = Integer.parseInt(num);
            String line = reader.readLine();
            String[] splitline = line.split("\\s");
            int[] array = new int[splitline.length];
            for (int i=0;i<splitline.length;i++){
                array[i] = Integer.parseInt(splitline[i]);
            }
            int count=0;

            for(int i=0;i<array.length-1;i++){
                for(int j=array.length-1;j>i;j--){
                    if(array[j-1] > array[j]){
                        int tmp = array[j-1];
                        array[j-1] = array[j];
                        array[j] = tmp;
                        count++;
                    }
                }
            }
            for(int i=0;i<array.length;i++){
                System.out.printf("%d"+" ",array[i]);
            }
            System.out.println("\n"+count+"\n");

        }catch (IOException e){
                System.out.println(e);
        }
    }
}
