import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number[] = new int[3];
        int count = 0;

        String word = br.readLine();
        String strArray[] = word.split(" ");

        try{
            for(int i=0;i<strArray.length;i++){
                if(strArray[i] != " ");
                number[count] = Integer.parseInt(strArray[i]);
                count++;
            }

            if(number[0] < number[1] && number[1] < number[2]){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }catch(ArrayIndexOutOfBoundsException e){

        }
    }
}