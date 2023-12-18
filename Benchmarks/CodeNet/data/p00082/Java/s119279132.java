import java.util.Scanner;
 
//Flying Jenny
public class Main{
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] c = {4,1,4,1,2,1,2,1};
        while(sc.hasNext()){
            int[] a = new int[8];
            for(int i=0;i<8;i++)a[i]=sc.nextInt();
            int min = Integer.MAX_VALUE;
            int v = 0;
            for(int top=0;top<8;top++){
                int r = 0;
                for(int j=0;j<8;j++){
                    r += Math.max(0, a[j]-c[(top+j)%8]);
                }
                if(r<min){
                    min = r;
                    v = top;
                }
            }
            for (int i = 0; i < 7; i++) {
                System.out.print(c[(i + v) % 8] + " ");
            }
            System.out.println(c[(7 + v) % 8]);
        }
    }
}
