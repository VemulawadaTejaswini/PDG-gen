import java.util.*;
public class Marks
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int k = reader.nextInt();
        int[] cek = new int[n];
        for(int i=0;i<n;i++){
            cek[i] = reader.nextInt();
        }
        for(int i=1;i<k;i++){
            if(cek[i+2]>cek[i]){
                System.out.println("yes");
            }   else{
                    System.out.println("no");
                }   
        }
    }
}
