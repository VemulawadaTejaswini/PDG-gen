import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
 import java.util.Scanner;

class prog{
    public static void Main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();
        
        for(int i=0;i<n;i++){
            array.add(scan.nextInt());
        }
        
        int count = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1; j++){
                if(array.get(j) > array.get(j + 1)){
                    int tmp = array.get(j);
                    array.set(j, array.get(j+1));
                    array.set(j + 1, tmp);
                    count++;
                }
            }
        }
        
        System.out.println(array);
        System.out.println(count);
        scan.close();
    }
}