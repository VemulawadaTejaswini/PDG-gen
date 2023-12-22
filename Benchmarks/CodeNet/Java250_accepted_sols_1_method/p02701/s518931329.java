import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strList = new String[n];
        for(int i = 0; i<n; i++){
            strList[i] = sc.next();
        }
        
        Arrays.sort(strList);
        int count = 0;

        count++;
        for(int i = 0; i<n-1; i++){
            if(!strList[i].equals(strList[i+1])){
                count++;
            }
        }
        System.out.println(count);
    }
}