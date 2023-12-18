
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a[] = br.readLine().split(" ");
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(i!=a.length-1){
                System.out.print(a[i]+" ");
            }else{
                System.out.println(a[i]);
            }
        }
    }
}