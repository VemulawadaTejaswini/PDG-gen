import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[6];
        for(int i = 0; i < 6; i++){
            array[i] = sc.nextInt();
        }
        String str = sc.next();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int temp = 0;
            if(c == 'E'){
                temp = array[5];
                array[5] = array[2];
                array[2] = array[0];
                array[0] = array[3];
                array[3] = temp;
            }else if(c == 'W'){
                temp = array[0];
                array[0] = array[2];
                array[2] = array[5];
                array[5] = array[3];
                array[3] = array[0];
            }else if(c == 'N'){
                temp = array[0];
                array[0] = array[1];
                array[1] = array[5];
                array[5] = array[4];
                array[4] = temp;
            }else{
                temp = array[0];
                array[0] = array[4];
                array[4] = array[5];
                array[5] = array[1];
                array[1] = temp;
            }
        }
        System.out.println(array[0]);
    }
}
