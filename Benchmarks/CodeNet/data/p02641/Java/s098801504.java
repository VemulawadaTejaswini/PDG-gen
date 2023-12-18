import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int array[] = new int[B];
        int val[] = new int[B];
        int anc = 0;
        for(int i = 0;i < B;i++){
            //int array[] = new int[B];
            //int val[] = new int[B];
            array[i] = sc.nextInt();
            val[i] = A - array[i];
        }
        Arrays.sort(val);
        int judj [][] = new int[B][2];
        for(int i = 0;i < B;i++){
            judj[i][0] = Math.abs(val[i]);
            judj[i][1] = (int)Math.signum(val[i]);
        }

        for(int i = 0;i < B;i++){
            if(judj[i][0] != i && judj[i][1] >= 0){
                anc = judj[i][0] + A;
            }
        }
        System.out.println(anc);
        if(B == 0){
            System.out.println(A);
        }        
        }
    }