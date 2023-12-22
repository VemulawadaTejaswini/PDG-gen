import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner stdIn= new Scanner(System.in);
        int x = stdIn.nextInt();
        int y = stdIn.nextInt();
        int [] high = new int[x];
        boolean [] gx=new boolean[x];	
        for(int i=0;i<x;i++){
            high[i] = stdIn.nextInt();
            gx[i]=true;
        }
        
        int count=0;
        for(int i=0;i<y;i++){
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();
            a--;
            b--;
            if(high[b]<high[a]){
                gx[b]=false;
            }else if(high[b]==high[a]){
                gx[a]=false;
                gx[b]=false;
            }else gx[a]=false;
        }
        for(int i=0;i<x;i++){
            if(gx[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}