import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int array[] = new int[1000000];
        array[0] = s;
        for(int i=1; i<array.length; i++){
            if(array[i-1] % 2 == 0){
                array[i] = array[i-1] / 2;
            }
            else{
                array[i] = array[i-1] *3 +1;
            }
        }
        int index = 0;
        out:for(int i=0; i<array.length-1; i++){
                for(int j=i+1; j<array.length; j++){
                    if(array[i] == array[j]){
                        index = j;
                        break out;
                    }
                }
            }
        System.out.println(index+1);
    }
}