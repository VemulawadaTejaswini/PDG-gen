import java.io.*;
/**
 *
 * @author Y
 */


public class Aizu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = 0;
        try{
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            N = Integer.parseInt(br.readLine());
            String[] sp = br.readLine().split(" "); 
            int[] a = new int[N];
                
            for(int i = 0;i<N;i++){
                a[i] = Integer.parseInt(sp[i]);
            } 
            insort(a);
            
            
        }catch(Exception e){
        }
        
    }
    public static void insort(int[] a){
        for(int i = 1; i<=a.length; i ++){
            int key = a[i];
            int j = i-1;
            while(j>=0 && a[j]>key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1]  = key;
            for(int k : a){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    } 
}