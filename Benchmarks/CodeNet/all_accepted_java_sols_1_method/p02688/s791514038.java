import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner stdIn= new Scanner(System.in);
        int x = stdIn.nextInt();
        boolean [] xx=new boolean[x];
        int y = stdIn.nextInt();
        for(int i=0;i<y;i++){
            int z = stdIn.nextInt();
            for(int t=0;t<z;t++){
               int a = stdIn.nextInt();
               xx[a-1]=true;
            }
        }
        int count=0;
        for(int i=0;i<xx.length;i++){
            if(!xx[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}